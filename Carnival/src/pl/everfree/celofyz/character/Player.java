package pl.everfree.celofyz.character;

import java.awt.Color;
import java.awt.Graphics;

import pl.everfree.celofyz.GameObject;
import pl.everfree.celofyz.ID;
import pl.everfree.celofyz.Main;

public class Player extends GameObject{

	public Player(int x, int y, ID id) {
		super(x, y, id);
	}

	@Override
	public void tick() {	
		if(getUp() == true) y = y - 5;
		if(getDown() == true) y = y + 5;
		if(getRight() == true) x = x + 5;
		if(getLeft() == true) x = x - 5;
		
		x = Main.clamp(x, 0, Main.WIDTH - 64);
		y = Main.clamp(y, 0, Main.HEIGHT - 64);
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, 64, 64);
	}
}
