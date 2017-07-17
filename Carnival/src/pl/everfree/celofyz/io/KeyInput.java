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
				
				if(key == KeyEvent.VK_W) tempObject.setUp(true);
				if(key == KeyEvent.VK_S) tempObject.setDown(true);
				if(key == KeyEvent.VK_A) tempObject.setLeft(true);;
				if(key == KeyEvent.VK_D) tempObject.setRight(true);;
			}
		}
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player){
				
				if(key == KeyEvent.VK_W) tempObject.setUp(false);;
				if(key == KeyEvent.VK_S) tempObject.setDown(false);;
				if(key == KeyEvent.VK_A) tempObject.setLeft(false);;
				if(key == KeyEvent.VK_D) tempObject.setRight(false);
			}
		}
	}
}
