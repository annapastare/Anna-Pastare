package lv.anna;

import java.util.ArrayList;

public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr = new String[2];
		System.out.println(arr.length);
		arr[0] = "ElementName";
		System.out.println(arr[0]);
		
		ArrayList<String> array = new ArrayList <>();
		System.out.println(array.size());
		array.add("Element to Array");
		array.add("Element");
		array.add("Object");
		array.add("3");
		System.out.println(array);
		System.out.println(array.size());
		

	}

}
