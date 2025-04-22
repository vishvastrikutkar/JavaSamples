package Java8;

import java.util.Comparator;
import java.util.TreeMap;


public class TreeMapDescOrderEmployeeLambda {
    public static void main(String[] args) {

        Comparator<Employee> comparator =(o1,o2)->o2.getEmpName().compareToIgnoreCase(o1.getEmpName());

        TreeMap<Employee,Integer> treeMap1 = new TreeMap<>(comparator);
        treeMap1.put(new Employee("Vishvas"),1);
        treeMap1.put(new Employee("Vaibhav"),2);
        treeMap1.put(new Employee("Xerox"),3);
        treeMap1.put(new Employee("Zcov"),4);
        treeMap1.put(new Employee("amily"),5);

        System.out.println(treeMap1);

    }
}
