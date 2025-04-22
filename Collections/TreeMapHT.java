package Collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapHT {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder outputString=new StringBuilder();
        // Read the number of lines
        System.out.println("Enter number of Test Cases: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int q=sc.nextInt();
            sc.nextLine();

            TreeMap<Integer,Integer> treeMap = new TreeMap<>();

            for(int j=0;j<q;j++)
            {
                String query = sc.next();
                switch (query)
                {
                    case "a":
                        int keyA= sc.nextInt();
                        int valueA=sc.nextInt();
                        treeMap.put(keyA,valueA);
                        break;
                    case "b":
                        int keyB=sc.nextInt();
                        if(treeMap.containsKey(keyB))
                            outputString.append(treeMap.get(keyB)).append( " ");
                        else
                            outputString.append("-1").append(" ");
                        break;
                    case "c":
                        outputString.append(treeMap.size()).append(" ");
                        break;
                    case "d":
                        int keyD=sc.nextInt();
                        treeMap.remove(keyD);
                        break;
                    case "e":
                        for(Map.Entry<Integer,Integer> entry:treeMap.entrySet())
                            outputString.append(entry.getKey()).append(" ");
                        break;
                }
            }
            outputString.append("\n");
        }
        System.out.println(outputString.toString().trim());
        sc.close();
    }
}
