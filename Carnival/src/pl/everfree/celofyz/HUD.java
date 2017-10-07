package pl.everfree.celofyz;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	
	public static int HEALTH = 100;
	
	public void tick(){
		HEALTH--;
	}
	
	public void render(Graphics g){
		g.setColor(Color.gray);
		g.fillRect(14, 14, 202, 34);
		g.setColor(Color.red);
		g.fillRect(15, 15, 200, 32);
		g.setColor(Color.green);
		g.fillRect(15, 15, Main.clamp(HEALTH * 2, 0, 100 * 2), 32);
	}

}
