package pl.everfree.celofyz.io;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import pl.everfree.celofyz.GameObject;
import pl.everfree.celofyz.Handler;
import pl.everfree.celofyz.ID;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	
	public KeyInput(Handler handler){
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player){
				
				if(key == KeyEvent.VK_W && tempObject.getVelY() > -5) tempObject.setVelY(tempObject.getVelY() - 5);
				if(key == KeyEvent.VK_S && tempObject.getVelY() < 5) tempObject.setVelY(tempObject.getVelY() + 5);
				if(key == KeyEvent.VK_A && tempObject.getVelX() > -5) tempObject.setVelX(tempObject.getVelX() - 5);
				if(key == KeyEvent.VK_D && tempObject.getVelX() < 5) tempObject.setVelX(tempObject.getVelX() + 5);
			}
		}
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player){
				
				if(key == KeyEvent.VK_W && tempObject.getVelY() < 5) tempObject.setVelY(tempObject.getVelY() + 5);
				if(key == KeyEvent.VK_S && tempObject.getVelY() > -5) tempObject.setVelY(tempObject.getVelY() - 5);
				if(key == KeyEvent.VK_A && tempObject.getVelX() < 5) tempObject.setVelX(tempObject.getVelX() + 5);
				if(key == KeyEvent.VK_D && tempObject.getVelX() > -5) tempObject.setVelX(tempObject.getVelX() - 5);
			}
		}
	}
}
