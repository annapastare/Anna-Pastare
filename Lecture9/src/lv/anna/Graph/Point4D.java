package lv.anna.Graph;

public class Point4D extends Point2D{
	private int z;
	private int t;
	
	
	public Point4D(int x, int y, int z, int t){
		super(x, y);
		this.z = z;
		this.t = t;
		
	}

	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}


	public int getT() {
		return t;
	}


	public void setT(int t) {
		this.t = t;
	}

	public String toString(){
		return "("+super.getX()+", "+super.getY()+", "+this.z+", "+this.t+")";
}
}
