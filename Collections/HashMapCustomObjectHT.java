package Collections;

import java.util.HashMap;
import java.util.Objects;

public class HashMapCustomObjectHT {

    public static void main(String[] args) {
        HashMap<Employee, String> employeeDepartmentMap = new HashMap<>();

        Employee employee1 = new Employee("Vishvas Trikutkar", 111);
        Employee employee2 = new Employee("Shreyas Talpade", 112);
        Employee employee3 = new Employee("Shrija Deshpande", 113);
        Employee employee4 = new Employee("Ashutosh Ranade", 114);
        Employee employee5 = new Employee("Vishvas Trikutkar", 115);

        employeeDepartmentMap.put(employee1,"Technology");
        employeeDepartmentMap.put(employee2,"Accounts");
        employeeDepartmentMap.put(employee3,"Administration");
        employeeDepartmentMap.put(employee4,"Management");
        employeeDepartmentMap.put(employee5,"Technology");

        for(Employee key:employeeDepartmentMap.keySet())
            System.out.println("Employee Name: "+key.getName() +" "+"Employee ID: "+key.getIdNumber() +" " +"Department: "+employeeDepartmentMap.get(key));

        System.out.println(employee1.toString());
        System.out.println(employee1.equals(employee5));

        System.out.println("Department for Employee "+employee1.getName() +" is "+employeeDepartmentMap.get(employee1));
    }


}

class Employee{
    private final String name;
    private final int idNumber;

    Employee(String name, int employeeCode)
    {
        this.name=name;
        this.idNumber=employeeCode;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return idNumber == employee.idNumber && Objects.equals(name, employee.name);
    }

    @Override
    public String toString() {
        return "Employee [idNumber=" + idNumber + ", Employee name='" + name + "']";
    }

}
