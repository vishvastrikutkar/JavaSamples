package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of lines
        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();

        // Read each line and store the integers
        for (int i = 0; i <n; i++) {

            String lineInputs = sc.nextLine();
            String[] lineInput=lineInputs.split(" ");
            int numOfIntegers=Integer.parseInt(lineInput[0]);

            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 1; j <= numOfIntegers; j++) {
                line.add(Integer.parseInt(lineInput[j]));
            }
            lines.add(line);
        }

        // Read the number of queries
        System.out.println("Enter Number of queries: ");
        int q = sc.nextInt();
        sc.nextLine();

        // Process each query
        for (int i = 0; i < q; i++) {

            String queryInputs = sc.nextLine();
            String[] queryInput = queryInputs.split( " ");

            int x = Integer.parseInt(queryInput[0]);
            int y = Integer.parseInt(queryInput[1]);

            // Check if the line and position are valid
            if (x > 0 && x <= lines.size() && y > 0 && y <= lines.get(x - 1).size()) {
                output.add(String.valueOf((lines.get(x - 1).get(y - 1))));
            } else {
                output.add("ERROR!");
            }
        }
        // Display output
        for(String s:output)
            System.out.println(s);

        sc.close();
    }
}

