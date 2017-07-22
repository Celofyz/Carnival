package pl.everfree.celofyz;

import java.awt.Graphics;

public abstract class GameObject {
	
	protected ID id;
	protected int x, y;
	protected int velX, velY;
	
	protected boolean right = false;
	protected boolean left = false;
	protected boolean up = false;
	protected boolean down = false;
	
	public GameObject(int x, int y, ID id){
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void move(int mx, int my){}

	public ID getId() {
		return id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

	public boolean getRight(){
		return right;
	}
	
	public void setRight(boolean right) {
		this.right = right;
	}
	
	public boolean getLeft(){
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}
	
	public boolean getUp(){
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}
	
	public boolean getDown(){
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

}
