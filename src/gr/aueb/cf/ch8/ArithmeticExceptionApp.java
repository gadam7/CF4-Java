package gr.aueb.cf.ch8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArithmeticExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator;
        int denominator;
        int result = 0;

        try {
            System.out.println("Please insert two ints for division");
            numerator = in.nextInt();
            denominator = in.nextInt();

            if (denominator ==0) System.out.println("");
            result = numerator / denominator;

            System.out.printf("%d / %d = %d", numerator, denominator, result);
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("Λάθος παρανομαστής");
        }
    }
}
