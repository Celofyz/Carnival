package pl.everfree.celofyz.character;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import pl.everfree.celofyz.GameObject;
import pl.everfree.celofyz.ID;
import pl.everfree.celofyz.Main;

public class Enemy extends GameObject {

	public Enemy(int x, int y, ID id) {
		super(x, y, id);
		

		velX = 5;
		velY = 5;
	}
	
	public void tick(){
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Main.HEIGHT) velY *= -1;
		if(x <= 0 || x >= Main.WIDTH) velX *= -1;
	}
	
	public void render(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(x, y, 64, 64);
	}
	
	

}
