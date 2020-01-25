package lv.anna;
import lv.anna.geometricfigures.Circle;
import lv.anna.player.FootballPlayer;

public class TestJava {


	public static void main(String[] args) {
		FootballPlayer player = new FootballPlayer("Ronaldo", "Forward", 7, true, 184, 83);
		Circle figure = new Circle();
		
		
		System.out.println(figure.getColor()+" "+figure.getRadius());
		
		
		
		//player.setName("Ronaldo");
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.isBuild());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());
		
		
		
		player.setShirtNumber(10); 
		System.out.println("_____________________________________");
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.isBuild());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());
		

	}

}
