package lv.anna;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr1 = {2, 3, 4, 6, 8, 10, 3};
		int[] arr2 = {2, 7, 6, 3};
		
		ArrayList<Integer> arrList = new ArrayList<> ();
		
		for(int i : arr1){
			for(int j : arr2){
				if(i == j){
					arrList.add(i);
					break;
					
				}
			}
		}
System.out.println(Arrays.asList(arrList));
	}

}
