package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        int[][] irregularArray = {
                {546, 23},
                {123, 345, 87},
                {345, 87, 907, 45}
        };

        for (int i = 0; i < irregularArray.length; i++) {
            for (int j = 0; j < irregularArray[i].length; j++) {
                System.out.print(irregularArray[i][j] + " ");
            }
        }

        System.out.println();

        for (int[] ints : irregularArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }

    }

}
