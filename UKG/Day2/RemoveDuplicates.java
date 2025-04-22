/*
    * Remove duplicates from an array
    * Input: {1, 2, 3, 4, 5, 1, 2, 1, 4, 5}
    * Output: 1 2 3 4 5
 */

package UKG.Day2;

import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 1, 2, 1, 4, 5};
        HashSet<Integer> intSet = new HashSet<>();

        for (int i : intArray) {
            intSet.add(i);
        }
        //Lambda Expression
        intSet.forEach(i-> System.out.print(i+" "));
    }
}
