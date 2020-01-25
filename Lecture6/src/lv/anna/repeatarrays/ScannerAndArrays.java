package lv.anna.repeatarrays;

import java.util.Scanner;

public class ScannerAndArrays {
	//User input array length
	//User add to element value
	//Array values are printed to console
	
	//Create methods for printing out array values

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];
		System.out.println("Input first array value");
		arr[0] = sc.nextInt();
		System.out.println("Input second array value");
		arr[1] = sc.nextInt();
		
		
		System.out.println(arr[0]+ ", "+arr[1]);
		
	}

}
