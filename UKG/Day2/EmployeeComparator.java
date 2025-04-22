/*
Sort a List of Employee Objects
Create an Employee class with id, name, salary fields, and sort employees by salary in descending order using Comparator.

 */
package UKG.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeInformation implements Comparable<EmployeeInformation>
{
    private int empId;
    private String empName;
    private double empSalary;

    public EmployeeInformation(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "EmployeeInformation{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

    @Override
    public int compareTo(EmployeeInformation o) {
        if(this.getEmpId() > o.getEmpId())
            return -1;
        else if(this.getEmpId() < o.getEmpId())
            return 1;
        else
            return 0;
    }
}

class SalaryComparator implements Comparator<EmployeeInformation> {
    @Override
    public int compare(EmployeeInformation o1, EmployeeInformation o2) {
        return Double.compare(o2.getEmpSalary(),o1.getEmpSalary());
    }
}

class NameComparator implements Comparator<EmployeeInformation> {
    @Override
    public int compare(EmployeeInformation o1, EmployeeInformation o2) {
        return o2.getEmpName().compareTo(o1.getEmpName());
    }
}


public class EmployeeComparator {
    public static void main(String[] args) {
        ArrayList<EmployeeInformation> arrayList =new ArrayList<>();
        arrayList.add(new EmployeeInformation(1,"Vaibhav",10000));
        arrayList.add(new EmployeeInformation(2,"Vaishnav",15000));
        arrayList.add(new EmployeeInformation(3,"Vishvas",13000));
        arrayList.add(new EmployeeInformation(4,"Viraj",12000));
        System.out.println("Employee: "+ arrayList);

        System.out.println("Sorted descending by ID");
        Collections.sort(arrayList);
        arrayList.forEach(e -> System.out.println(e.toString()));

        System.out.println("Sorted descending by Salary");
        Collections.sort(arrayList,new SalaryComparator());
        arrayList.forEach(e -> System.out.println(e.toString()));

        System.out.println("Sorted descending by Name");
        Collections.sort(arrayList,new NameComparator());
        arrayList.forEach(e -> System.out.println(e.toString()));

    }



}
