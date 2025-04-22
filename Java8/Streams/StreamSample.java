package Java8.Streams;




import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamSample {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Vishvas",45220));
        employees.add(new Employee(11,"Shreya",65200));
        employees.add(new Employee(12,"Shreeniket",89555));
        employees.add(new Employee(13,"Mayuri",102334));

        employees.forEach(System.out::println);

        System.out.println("Employee with Emp ID > 10");
        employees.stream()
                .filter(employee -> employee.getEmpID()>10)
                .forEach(System.out::println);

        System.out.println("Employee Names > 10");
        List<String> employeeNames = employees.stream()
                .map(Employee::getEmpName).toList();
        employeeNames.forEach(System.out::println);

        Stream<Employee> s1 = employees.stream();
        System.out.println(s1.count());

        Optional<Employee> HighSalary = employees.stream().max(Comparator.comparingDouble(Employee::getEmpSalary));
        HighSalary.ifPresent(e -> System.out.println("\nHighest Paid Employee ID: " + e.getEmpID() + " Salary "+e.getEmpSalary()));

        System.out.println("Total Salary: "+ employees.stream().mapToDouble(Employee::getEmpSalary).sum());
        System.out.println("Total number of Employees "+employees.stream().count());

        System.out.println("Employee with S in their name");
        employees.stream().filter(employee -> employee.getEmpName().toLowerCase().contains("s")).forEach(System.out::println);

        System.out.println("Employee with more than 80K salary :");
        List<Employee> highEarners = employees.stream().filter(employee -> employee.getEmpSalary()>80000).toList();
        highEarners.forEach(System.out::println);

        employees.stream().map(Employee::getEmpSalary).toList().forEach(System.out::println);

        double totalSalaryPaid = employees.stream().map(Employee::getEmpSalary).reduce(0.0,Double::sum);
        System.out.println("Total: " +totalSalaryPaid);



    }
}
