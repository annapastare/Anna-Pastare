package lv.anna;

import java.util.ArrayList;

public class TaskTestArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			ArrayList<String> cars = new ArrayList<String> ();
			cars.add("Volvo");
			cars.add("BMW");
			cars.add("Ford");
			cars.add("Mazda");
			System.out.println(cars.indexOf("Volvo"));
			System.out.println(cars.isEmpty());
			System.out.println(cars.get(3));
			System.out.println(cars.set(3, "Opel"));
			cars.clear();
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
			

			
			

	}
}


			

