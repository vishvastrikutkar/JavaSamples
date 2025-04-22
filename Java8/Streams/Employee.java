package Java8.Streams;

public class Employee {

    private final int empID;
    private final String empName;
    private final double empSalary;

    public Employee(int id,String name,double salary)
    {
        this.empID = id;
        this.empName = name;
        this.empSalary=salary;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpID() {
        return empID;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + empID +
                ", name='" + empName + '\'' +
                ", salary=" + empSalary +
                '}';
    }
}
