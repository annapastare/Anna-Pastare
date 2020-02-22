package lv.komanda;
import lv.komanda.TestUserDate;
import lv.komanda.TestMonthInput;
import lv.komanda.getHoroskope;
import lv.komanda.FinalHoroskope;

import java.util.Scanner;


public class TestAll extends AllDate {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        TestUserDate a = new TestUserDate();
        System.out.print("Write your birth date: ");
        date = sc.nextInt();
        a.inputDate(); // Data check

        System.out.print("Write your birth month: ");
        month = sc.next();

        TestMonthInput b = new TestMonthInput();
        b.inputMonth(); // Month check

        System.out.println("Your sign is: "+sign);

        getHoroskope c = new getHoroskope(); // Finding right sign
        c.getHoroskope();

        FinalHoroskope d = new FinalHoroskope(); // Horoskope Description
        d.horoskopDescription();


    }
}
