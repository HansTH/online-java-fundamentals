package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 * <p>
 * Take in a number from the user and print "January", "February", ... "December", or "Other"
 * if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12 to determine witch month it is: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("It is January");
                break;
            case 2:
                System.out.println("It is February");
                break;
            case 3:
                System.out.println("It is March");
                break;
            case 4:
                System.out.println("It is April");
                break;
            case 5:
                System.out.println("It is May");
                break;
            case 6:
                System.out.println("It is June");
                break;
            case 7:
                System.out.println("It is July");
                break;
            case 8:
                System.out.println("It is August");
                break;
            case 9:
                System.out.println("It is September");
                break;
            case 10:
                System.out.println("It is October");
                break;
            case 11:
                System.out.println("It is November");
                break;
            case 12:
                System.out.println("It is December");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
