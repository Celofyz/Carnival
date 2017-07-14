package pl.everfree.celofyz;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import pl.everfree.celofyz.character.Player;

public class Main extends Canvas implements Runnable {
	
	private static final long serialVersionUID = -8836288138872704665L;
	
	public static final int WIDTH = 1280;
	public static final int HEIGHT = WIDTH / 16*9;
	
	private Thread thread;
	private boolean running = false;
	
	private Handler handler;
	
	Main(){
		new Window(WIDTH, HEIGHT, "Carnival", this);
		
		handler = new Handler();
		handler.addObject(new Player(100, 100, ID.Player));
	}

	public synchronized void start(){
		if(running == false){
			thread = new Thread(this);
			thread.start();
			
			running = true;
		}
		return;
	}
	
	public void stop(){
		try{
			thread.join();
			running = false;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void run(){
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(running){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1){
				tick();
				delta--;
			}
			if(running)
				render();
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000){
				timer += 1000;
				System.out.println("FPS: " + frames);
				frames = 0;
			}
			
		}
		
	}
	public void tick(){
		handler.tick();
	}
	public void render(){
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null){
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		handler.render(g);
		
		g.dispose();
		bs.show();
	}

	public static void main(String[] args) {
		new Main();
		
	}

}
