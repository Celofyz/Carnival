package pl.everfree.celofyz.character;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import pl.everfree.celofyz.GameObject;
import pl.everfree.celofyz.ID;

public class Enemy extends GameObject {
	
	int a = -5;
	int b = -6;
	
	boolean ba = true;
	boolean bb = false;
	
	Random r = new Random();

	public Enemy(int x, int y, ID id) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
	}
	
	public void tick(){
		x = x + a;
		y = y + b;
		
		if(ba){
			a = a + r.nextInt(3);
			if(a > 5){
				ba = false;
			}
		}		
		else{
			a = a - r.nextInt(3);
			if(a < -5){
				ba = true;
			}
		}
		if(bb){
			b = b + r.nextInt(3);
			if(b > 6){
				bb = false;
			}
		}		
		else{
			b = b - r.nextInt(3);
			if(b < -6){
				bb = true;
			}
		}
	}
	
	public void render(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(x, y, 64, 64);
	}
	
	

}
