package lv.anna;

import java.util.ArrayList;

public class TestTaskLoopArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String> ();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		for(String c : cars){
			System.out.println(c);
		}
		

	}

}
