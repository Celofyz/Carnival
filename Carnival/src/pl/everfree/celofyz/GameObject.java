package pl.everfree.celofyz;

public abstract class GameObject {
	
	protected ID id;
	protected int x, y;
	protected int velX, VelY;
	
	public GameObject(int x, int y, ID id){
		this.x = x;
		this.y = y;
		this.id = id;
	}
}
