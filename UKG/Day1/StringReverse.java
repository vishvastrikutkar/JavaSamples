/*
1.	Reverse a String
o	Write a Java program to reverse a given string without using built-in methods.
o	Input: "Automation" → Output: "noitamotuA"

 */
package UKG.Day1;

public class StringReverse {

    public static void main(String[] args) {
        String inputString = "Automation";
        String outputString="";
        for(int i=inputString.length()-1;i>=0;i--) {
            System.out.print(outputString+inputString.charAt(i));
        }
    }
}
