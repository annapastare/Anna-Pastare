package lv.anna.horoscope;

import java.util.Scanner;

public class TestUserDate {

	public static void main(String[] args) {
		int date = 0;
		String month;
		Scanner sc = new Scanner (System.in);
		System.out.println("Write your birth date: ");
		date = sc.nextInt();
		while(date>31){
		System.out.println("Wrong date. Try again.");
		date = sc.nextInt();

	}
}
}

