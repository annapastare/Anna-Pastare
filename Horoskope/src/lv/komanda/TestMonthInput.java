package lv.komanda;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestMonthInput extends AllDate {
    public static void inputMonth() {

        Scanner sc = new Scanner(System.in);
        if (month.equalsIgnoreCase("January")) {
            if (date < 20) {
                sign = "Capricorn";
            } else if (date <= 31)
                sign = "Aquarius";
            else {
                System.out.println("Error");
            }

        } else if (month.equalsIgnoreCase("February")) {
            if (date < 19) {
                sign = "Aquarius";
            } else {
                sign = "Pisces";
            }
        } else if (month.equalsIgnoreCase("March")) {
            if (date < 21)
                sign = "Pisces";
            else
                sign = "Aries";

        } else if (month.equalsIgnoreCase("April")) {
            if (date < 20)
                sign = "Aries";
            else
                sign = "Taurus";

        } else if (month.equalsIgnoreCase("May")) {
            if (date < 21)
                sign = "Taurus";
            else
                sign = "Gemini";

        } else if (month.equalsIgnoreCase("June")) {
            if (date < 21)
                sign = "Gemini";
            else
                sign = "Cancer";

        } else if (month.equalsIgnoreCase("July")) {
            if (date < 23)
                sign = "Cancer";
            else
                sign = "Leo";

        } else if (month.equalsIgnoreCase("August")) {
            if (date < 23)
                sign = "Leo";
            else
                sign = "Virgo";

        } else if (month.equalsIgnoreCase("September")) {
            if (date < 23)
                sign = "Virgo";
            else
                sign = "Libra";

        } else if (month.equalsIgnoreCase("October")) {
            if (date < 23)
                sign = "Libra";
            else
                sign = "Scorpio";

        } else if (month.equalsIgnoreCase("November")) {
            if (date < 22)
                sign = "Scorpio";
            else
                sign = "Sagittarius";

        } else if (month.equalsIgnoreCase("December")) {
            if (date < 22)
                sign = "Sagittarius";
            else
                sign = "Capricorn";
        } else {
            List<String> list = Arrays.asList(AllMonths);

            do {
                System.out.print("Error. Try again. Please insert correct month: ");
                month = sc.next();
            }
            while (list.contains(month) == true);
                inputMonth();
            }

        }
    }



