package lv.anna.Graph;


//To inheritance class we use extends keyword
public class Point3D extends Point2D{
	private int z;
	
	public Point3D(){
		super();
		this.z = 0;
		
	}
	public Point3D(int x, int y, int z){
		super(x, y);
		this.z = z; 
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public String toString(){
		return "("+super.getX()+", "+super.getY()+", "+this.z+")";
}
}
