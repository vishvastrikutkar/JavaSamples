package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSortEmpNameComparatorLambda {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList =new ArrayList<>();
        arrayList.add(new Employee("Vishvas"));
        arrayList.add(new Employee("Vaibhav"));
        arrayList.add(new Employee("Xerox"));
        arrayList.add(new Employee("Akash"));
        System.out.println("Employee: "+ arrayList);

        Comparator<Employee> comparator = (o1,o2)->o2.getEmpName().compareToIgnoreCase(o1.getEmpName());

        Collections.sort(arrayList,comparator);
        System.out.println("Employee: "+ arrayList);

    }



}
