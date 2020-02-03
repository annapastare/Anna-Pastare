package lv.anna;

import java.util.ArrayList;
import java.util.Collections;

public class TestArraysWithObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer intObj = 40;
		Double doubleObj = 40.24;
		System.out.println(intObj);
		
		ArrayList<Integer> intArrays = new ArrayList<> ();
		
		intArrays.add(40);
		intArrays.add(23);
		intArrays.add(14);
		intArrays.add(60);
		System.out.println(intArrays);
		Collections.sort(intArrays);
		System.out.println(intArrays);
		
		

	}

}
