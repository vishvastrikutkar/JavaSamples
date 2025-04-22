package Java8;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDescOrderEmployee {
    public static void main(String[] args) {

        Comparator<Employee> comparator =new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getEmpName().compareToIgnoreCase(o1.getEmpName());
            }
        };

        TreeMap<Employee,Integer> treeMap = new TreeMap<>(comparator);
        treeMap.put(new Employee("Vishvas"),1);
        treeMap.put(new Employee("Vaibhav"),2);
        treeMap.put(new Employee("Xerox"),3);
        treeMap.put(new Employee("Zcov"),4);
        treeMap.put(new Employee("amily"),5);

        System.out.println(treeMap);

    }
}
