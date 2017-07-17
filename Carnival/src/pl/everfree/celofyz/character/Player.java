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
	public void tick() {	
		if(up == true) y = y - 2;
		if(down == true) y = y + 2;
		if(right == true) x = x + 2;
		if(left == true) x = x - 2;
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, 32, 32);
	}
}
