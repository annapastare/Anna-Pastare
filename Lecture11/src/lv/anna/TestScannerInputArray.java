package lv.anna;

import java.util.Scanner;

public class TestScannerInputArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strArr = new String[2];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(strArr.length+" users in array:");
		for(int i = 0; i < strArr.length; ++i){
			strArr[i] = sc.nextLine();
			
		}
		System.out.println("Do you want to print an array?");
		System.out.println("Type (Print)");
		System.out.println("Type (notPrint)");
		String statusCheck = sc.nextLine();
		
		if(statusCheck.equals("Print")){
			printArray(strArr);
		}else if(statusCheck.equals("notPrint")){
			System.out.println("Exit");
		}else{
			System.out.println("You entered it wrong");
		}
		
		
		

	}

	private static void printArray(String[] strArr) {
		// TODO Auto-generated method stub
		
	}



		
	}

