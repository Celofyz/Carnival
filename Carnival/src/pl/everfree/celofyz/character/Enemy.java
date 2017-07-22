package pl.everfree.celofyz.character;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import pl.everfree.celofyz.GameObject;
import pl.everfree.celofyz.ID;

public class Enemy extends GameObject {

	public Enemy(int x, int y, ID id) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(x, y, 64, 64);
	}
	
	

}
