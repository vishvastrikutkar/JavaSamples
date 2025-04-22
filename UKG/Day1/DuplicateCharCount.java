/*
Find the Duplicate Characters in a String
Given a string, identify duplicate characters and their count.
Input: "Java Programming" → Output: {a=3, g=2, r=2}

 */

package UKG.Day1;

public class DuplicateCharCount {

    public static void main(String[] args) {
        String inputString = "Java Programming";
        int[] charCount = new int[256];
        for (char c : inputString.toCharArray()) {
            if (!Character.isSpaceChar(c)) {
                charCount[c]++;
            }
        }

        // To Show only Duplicate Characters and its count
        for(int i=0;i<charCount.length;i++) {
            if(charCount[i]>1) {
                System.out.println("Character: "+(char)i+" Count: "+charCount[i]);
            }
        }
    }
}
