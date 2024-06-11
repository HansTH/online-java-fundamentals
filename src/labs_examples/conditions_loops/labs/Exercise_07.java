package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 * <p>
 * Take in a word from the user and using a "while" loop, find the first vowel in the word.
 * Once you find the vowel, print out the word and the first vowel.
 * <p>
 * Hints:
 * - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 * - you'll likely want to use a String that contains all the vowels:
 * - ie: String vowels = "aeiou";
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.next();

        int index = 0;
        while (index < word.length()) {
            if (word.toLowerCase().charAt(index) == 'a'
                    || word.toLowerCase().charAt(index) == 'e'
                    || word.toLowerCase().charAt(index) == 'i'
                    || word.toLowerCase().charAt(index) == 'o'
                    || word.toLowerCase().charAt(index) == 'u') {
                System.out.println("The first vowel in \"" + word + "\" is: " + word.charAt(index));
                break;
            }

            index++;
        }

    }
}
