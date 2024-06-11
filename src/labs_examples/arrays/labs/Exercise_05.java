package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 * Traversing Arrays Backwards
 * <p>
 * Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 * element in the array in reverse order.
 */

public class Exercise_05 {

    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4, 5, 6, 7, 8, 9};

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = arr.length -1 ; i >= 0; i--) {
            reversedList.add(arr[i]);
        }

        System.out.println(reversedList);

    }
}
