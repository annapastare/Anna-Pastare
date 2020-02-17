package lv.anna.horoscope;

import java.util.Scanner;

public class horoscopeSigns {

	public static void main(String[] args) {
		int date = 0;
		String month = "";
		String sign = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Write your birth date: ");
		date = sc.nextInt();
		System.out.println("Write your birth month: ");
		month = sc.next();

		if (month.equals("January")) {
			if (date < 20)
				sign = "Capricorn";
			else
				sign = "Aquarius";
		} else if (month.equals("February")) {
			if (date < 19)
				sign = "Aquarius";
			else
				sign = "Pisces";
		} else if (month.equals("March")) {
			if (date < 21)
				sign = "Pisces";
			else
				sign = "Aries";
		} else if (month.equals("April")) {
			if (date < 20)
				sign = "Aries";
			else
				sign = "Taurus";
		} else if (month.equals("May")) {
			if (date < 21)
				sign = "Taurus";
			else
				sign = "Gemini";
		} else if (month.equals("June")) {
			if (date < 21)
				sign = "Gemini";
			else
				sign = "Cancer";
		} else if (month.equals("July")) {
			if (date < 23)
				sign = "Cancer";
			else
				sign = "Leo";
		} else if (month.equals("August")) {
			if (date < 23)
				sign = "Leo";
			else
				sign = "Virgo";
		} else if (month.equals("September")) {
			if (date < 23)
				sign = "Virgo";
			else
				sign = "Libra";
		} else if (month.equals("October")) {
			if (date < 23)
				sign = "Libra";
			else
				sign = "Scorpio";
		} else if (month.equals("November")) {
			if (date < 22)
				sign = "Scorpio";
			else
				sign = "Sagittarius";
		} else if (month.equals("December")) {
			if (date < 22)
				sign = "Sagittarius";
			else
				sign = "Capricorn";
		}
		System.out.println("Your horoscope sign is: " + sign);
		
		switch (sign) {
		case "Capricorn" :
			System.out.println("AAA");
			break; 
		case "Aquarius" :
			System.out.println("BBB");
			break;
		case "Pisces" :
			System.out.println("CCC");
			break;
		case "Aries" :
			System.out.println("DDD");
			break;
		case "Taurus" :
			System.out.println("EEE");
			break;
		case "Gemini" :
			System.out.println("FFF");
			break;
		case "Cancer" :
			System.out.println("GGG");
			break;
		case "Leo" :
			System.out.println("HHH");
			break;
		case "Virgo" :
			System.out.println("III");
			break;
		case "Libra" :
			System.out.println("JJJ");
			break;
		case "Scorpio" :
			System.out.println("KKK");
			break;
		case "Sagittarius" :
			System.out.println("LLL");
			break;
		
	}
	
}
}



