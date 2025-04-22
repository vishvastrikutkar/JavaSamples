package Java8;

class EmployeeDetails
{
    private static String name;
    private String account;
    private double salary;

    public EmployeeDetails(String name,String account,double salary)
    {
        System.out.println("Creating Employee...");
        EmployeeDetails.name =name;
        this.account=account;
        this.salary=salary;
    }

    static String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getAccount() {
        return account;
    }

    @Override
    public String toString()
    {
        return "Employee Name :"+getName()+"\tAccount :"+getAccount()+"\tSalary :"+getSalary();
    }
}

@FunctionalInterface
interface EmployeeInterface{
    EmployeeDetails createEmployee(String name, String account,double salary);
}

@FunctionalInterface
interface EmployeeName{
    String getEmployeeName();
}

@FunctionalInterface
interface EmployeeAccount{
    String getEmployeeAccount();
}

@FunctionalInterface
interface EmployeeSalary{
    Double getEmployeeSalary();
}

public class ConstructorReference {

    public static void main(String[] args) {

        // Using Lambda expression

        EmployeeInterface employeeInterface1 = (name,account,salary)->{
            return new EmployeeDetails(name,account,salary);
        };
        EmployeeDetails employee1 = employeeInterface1.createEmployee("Shreya Trikutkar","XYZ",25000);
        System.out.println(employee1);

        EmployeeName employeeName1 = ()-> {
            return EmployeeDetails.getName();
        };
        System.out.println(employeeName1.getEmployeeName());

        EmployeeAccount employeeAccount1 = ()-> {
            return employee1.getAccount();
        };
        System.out.println(employeeAccount1.getEmployeeAccount());

        EmployeeSalary employeeSalary1 = ()-> {
            return employee1.getSalary();
        };
        System.out.println(employeeSalary1.getEmployeeSalary());

        // Constructor Reference : Here we are mapping createEmployee method of the Functional Interface to the constructor of EmployeeDetails class
        EmployeeInterface employeeInterface=EmployeeDetails::new;
        EmployeeDetails employee = employeeInterface.createEmployee("Vishvas Trikutkar","EPM-INRT", 40000);

        System.out.println(employee);


        // Method Reference : Here we are mapping the Functional Interface method getEmployeeName() to User defined getName() method
        // As the getName method is static we can map this using class name
        EmployeeName employeeName=EmployeeDetails::getName;
        System.out.println(employeeName.getEmployeeName());

        // Method Reference : Here we are mapping the Functional Interface method getEmployeeAccount() to User defined getAccount() method
        EmployeeAccount employeeAccount=employee::getAccount;
        System.out.println(employeeAccount.getEmployeeAccount());

        // Method Reference : Creating object at runtime.
        EmployeeSalary employeeSalary=new EmployeeDetails("Mayuri Trikutkar","EPM-INRT", 35000)::getSalary;
        System.out.println(employeeSalary.getEmployeeSalary());
    }

}
