package lv.anna.repeat;

import java.util.Scanner;

public class TestJava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input value ");
		int inputvalue;
		boolean done = true; 
		
		
		while(!(input.hasNextInt())){
		
		
		if(input.hasNextInt()){
			inputvalue = input.nextInt();
			done = true;
		}else{
			done = false; 
			
			
		}
		
	}

}
