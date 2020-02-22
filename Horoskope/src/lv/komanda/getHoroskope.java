package lv.komanda;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class getHoroskope extends TestMonthInput {




    public static void getHoroskope() {
        Scanner sc = new Scanner(System.in);
        if (month.equalsIgnoreCase("January")) {
            if (date < 20) {
                sign = "Capricorn";
            } else {
                sign = "Aquarius";
            }
        }

        if (month.equalsIgnoreCase("February")) {
            if (date < 19) {
                sign = "Aquarius";
            } else if (date <= 29) {
                sign = "Pisces";
            } else {
                System.out.println("Error. There are only 29 days in February");

            }
        }

        if (month.equalsIgnoreCase("March")) {
            if (date < 21) {
                sign = "Pisces";
            } else {
                sign = "Aries";
            }
        }

        if (month.equalsIgnoreCase("April")) {
            if (date < 20) {
                sign = "Aries";
            } else if (date <= 30) {
                sign = "Taurus";
            } else {
                System.out.println("Error. April has only 30 days");
            }
        }
        if (month.equalsIgnoreCase("May")) {
            if (date < 21) {
                sign = "Taurus";
            } else {
                sign = "Gemini";
            }
        }

        if (month.equalsIgnoreCase("June")) {
            if (date < 21) {
                sign = "Gemini";
            } else if (date <= 30) {
                sign = "Cancer";
            } else {
                System.out.println("Error. June has only 30 days");
            }
        }

        if (month.equalsIgnoreCase("July")) {
            if (date < 23) {
                sign = "Cancer";
            } else {
                sign = "Leo";
            }
        }
        if (month.equalsIgnoreCase("August")) {
            if (date < 23) {
                sign = "Leo";
            } else {
                sign = "Virgo";
            }
        }
        if (month.equalsIgnoreCase("September")) {
            if (date < 23) {
                sign = "Virgo";
            } else if (date <= 30) {
                sign = "Libra";
            } else {
                System.out.println("Error. September has only 30 days");
            }
        }

        if (month.equalsIgnoreCase("October")) {
            if (date < 23) {
                sign = "Libra";
            } else {
                sign = "Scorpio";
            }
        }
        if (month.equalsIgnoreCase("November")) {
            if (date < 22) {
                sign = "Scorpio";
            } else if (date <= 30) {
                sign = "Sagittarius";
            } else {
                System.out.println("Error. November has only 30 days");
            }
        }
        if (month.equalsIgnoreCase("December")) {
            if (date < 22) {
                sign = "Sagittarius";
            } else {
                sign = "Capricorn";
            }

            System.out.println(sign);
            }
        }
//    public static void monthCheckInArray() {
//        Scanner sc = new Scanner(System.in);
//
//        List <String> list = Arrays.asList(AllMonths);
//        do {
//            System.out.println("Error. Try again. Please insert correct month");
//            month = sc.next();
//            TestMonthInput b2 = new TestMonthInput();
//            b2.inputMonth(); // Month check
//        }
//        while (list.contains(month) == false);
//    }
    }


