package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers separated by a comma: ");
        String[] numbers = scanner.nextLine().split(",");

        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }

        System.out.println("The sum of numbers is: " + sum);
    }

}
