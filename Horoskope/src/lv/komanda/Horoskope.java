package lv.komanda;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Horoskope  {

    public static void main(String[] args) {

        int date;
        String month = "";
        String sign = "";
        Scanner sc = new Scanner(System.in);
        String[] AllMonths = new String[] {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};

        System.out.println("Write your birth date: ");
        date = sc.nextInt();



        while(date>31) {
            System.out.println("Wrong data. Try again");
            date = sc.nextInt();
        }
        System.out.println("Write your birth month: ");
        month = sc.next();







        if (month.equalsIgnoreCase("January")) {
            if (date < 20){
                sign = "Capricorn";
            }
            else if(date<=31)
                sign = "Aquarius";
            else {
                System.out.println("Error");
            }

        }else if (month.equalsIgnoreCase("February")) {
            if (date < 19){
                sign = "Aquarius";
            }else{
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
        } else { List<String> list = Arrays.asList(AllMonths);

            do { System.out.println("Error. Try again. Please insert correct month");
                month = sc.next();}
            while(list.contains(month)==false) ;

        }


        System.out.println("Your sign is: "+sign);


        switch (sign) {
            case "Capricorn" :
                System.out.println("Development and progress in all areas of life are possible this year if you focus on yourself and what’s most important.");
                break;
            case "Aquarius" :
                System.out.println("2020 is the year to prove your abilities, Aquarius! You will be at your creative peak this year.");
                break;
            case "Pisces" :
                System.out.println("The 2020 horoscopes for the Pisces astrology sign foretell that this will be a year of excitement and adventure for the Fishes.");
                break;
            case "Aries" :
                System.out.println("2020 will be all about balance for the Aries zodiac sign. Even though you will be ambitious, you will be more realistic about your goals.");
                break;
            case "Taurus" :
                System.out.println("This is a year when important choices need to be made. Be it relationships or your job; be sure of what you decide.");
                break;
            case "Gemini" :
                System.out.println("You have to set the pace for yourself this year. If it feels too slow, then be more active.");
                break;
            case "Cancer" :
                System.out.println("The Cancer star sign needs to be ready for changes in 2020. The astrology forecasts for 2020 predict that improvement in love and career is on the card.");
                break;
            case "Leo" :
                System.out.println("Life will be full of twists and turns for the Leo sun sign in 2020. The Lions will be filled with vitality and vigor to achieve their dreams this year.");
                break;
            case "Virgo" :
                System.out.println("The Virgo astrological sign will be out of their nature in 2020. Known to be practical, the virgins might make some very impulsive decisions in 2020.");
                break;
            case "Libra" :
                System.out.println("The Libra star sign will have a relatively easy 2020. This is a year to enjoy and make merry.");
                break;
            case "Scorpio" :
                System.out.println("The zodiac 2020 predictions foretell that this will be a year of liberation and freedom for the Scorpio zodiac sign. You will feel free of all restrictions and limitations in your life.");
                break;
            case "Sagittarius" :
                System.out.println("2020 is a year of resolutions for the Sagittarius zodiac sign. This is a good time to let go of your past baggage.");
                break;
        }
    }
}
