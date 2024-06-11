package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 * <p>
 * Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 * of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 * Print the results to the console.
 * <p>
 * For example, if a user enters 1 and 100, the output should be:
 * <p>
 * The sum is: 5050
 * The average is: 50.5
 */

public class Exercise_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int lower = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a number higher than the first input: ");
        int upper = scanner1.nextInt();

        if (upper > lower) {
            int sum = 0;
            int counter = 0;

            for (int i = lower; i <= upper; i++) {
                sum += i;
                counter++;
            }

            double average = (double) sum / counter;
            System.out.println("The sum is: " + sum);
            System.out.println("The average is: " + average);

        } else {
            System.out.println("Invalid input");
        }
    }
}
