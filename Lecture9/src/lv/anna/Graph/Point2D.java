package lv.anna.Graph;

public class Point2D {
	private int x;
	private int y;
	
	//izveido konstruktoru
	public Point2D(){
		this.x = 0;
		this.y = 0;
		
	}
	
	public Point2D(int x, int y){
		this.x = x;
		this.y = y;
	}
	//uztaisa getter un setter - source - generate getters and setters

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

	//taisa toString metodi
	public String toString(){
		return "("+this.x+", "+this.y+")";
		
		
	}
}
