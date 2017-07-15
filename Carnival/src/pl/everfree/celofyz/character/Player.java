package pl.everfree.celofyz.character;

import java.awt.Color;
import java.awt.Graphics;

import pl.everfree.celofyz.GameObject;
import pl.everfree.celofyz.ID;

public class Player extends GameObject{

	public Player(int x, int y, ID id) {
		super(x, y, id);
	}
	@Override
	public void move(int mx, int my){
		x += mx;
		y += my;
	}

	@Override
	public void tick() {	
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, 32, 32);
	}

}
