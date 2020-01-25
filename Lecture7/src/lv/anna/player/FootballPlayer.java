package lv.anna.player;

public class FootballPlayer {
	String name;
	String position; 
	int shirtNumber;
	boolean build;
	long height;
	int weight;
	
	public FootballPlayer(String name, String position, int shirtNumber, boolean build, long height, int weight){
		this.name = name;
		this.position = position;
		this.shirtNumber = shirtNumber;
		this.build = build;
		this.height = height;
		this.weight = weight;
		
		
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getShirtNumber() {
		return shirtNumber;
	}
	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}
	public boolean isBuild() {
		return build;
	}
	public void setBuild(boolean build) {
		this.build = build;
	}
	public long getHeight() {
		return height;
	}
	public void setHeight(long height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	} 
		
}
	
