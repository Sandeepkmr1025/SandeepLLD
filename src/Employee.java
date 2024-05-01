import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {

    private String name;
    private int salary;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static List<Employee> getEmployeeList() {
        return employeeList;
    }

    public static void setEmployeeList(List<Employee> employeeList) {
        Employee.employeeList = employeeList;
    }

    private static List<Employee> employeeList = new ArrayList<>();

    public Employee(String name, int salary, String email) {
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("A", 5000, "a@email.com");
        Employee emp1 = new Employee("A", 4000, "a@email.com");
        Employee emp2 = new Employee("A", 6000, "a@email.com");
        Employee emp3 = new Employee("A", 8000, "a@email.com");
        Employee emp4 = new Employee("A", 7000, "a@email.com");

        employeeList.add(emp);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        });

        Object[] array = employeeList.toArray();

        Employee employee = (Employee) array[2];

        System.out.println(employee.salary);

        double num = 1.0/0.0;

        System.out.println(num);

        double thirdHighestSalary = employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Less than 3 employees"));

        System.out.println(thirdHighestSalary);
    }
}
