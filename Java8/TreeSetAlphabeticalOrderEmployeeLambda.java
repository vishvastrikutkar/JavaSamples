package Java8;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetAlphabeticalOrderEmployeeLambda {
    public static void main(String[] args) {

        Comparator<Employee> comparator = (o1, o2) -> o1.getEmpName().compareToIgnoreCase(o2.getEmpName());

        TreeSet<Employee> treeSet = new TreeSet<>(comparator);
        treeSet.add(new Employee("Vishvas"));
        treeSet.add(new Employee("Vaibhav"));
        treeSet.add(new Employee("Xerox"));
        treeSet.add(new Employee("Zcov"));
        treeSet.add(new Employee("amily"));

        System.out.println(treeSet);

    }
}
