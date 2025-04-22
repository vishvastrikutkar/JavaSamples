package Java8;

public class Employee {
    private final String empName;

    Employee(String name) {
        this.empName = name;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return getEmpName();
    }
}
