package lv.komanda;

import java.util.Scanner;

public class TestUserDate extends AllDate {


    public static void inputDate() {
        Scanner sc = new Scanner(System.in);
        while(date>31) {
            System.out.print("Wrong data. Try again write your birth date: ");
            date = sc.nextInt();
        }
    }
}