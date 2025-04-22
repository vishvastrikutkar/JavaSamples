/*
Merge Two Sorted Arrays Without Duplicates
Merge two sorted arrays into one sorted array without duplicates.
Input: [1, 3, 5], [2, 3, 6] → Output: [1, 2, 3, 5, 6]
 */

package UKG.Day2;

import java.util.Arrays;
import java.util.TreeSet;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {1, 4, 7, 8,10};

        TreeSet<Integer> intSet = new TreeSet<>();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i : arr1) {
            intSet.add(i);
        }
        for (int i : arr2) {
            intSet.add(i);
        }
        System.out.println("Merged Array: ");
        System.out.print(intSet);
    }
}
