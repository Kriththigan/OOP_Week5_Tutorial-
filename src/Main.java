import java.util.*;
public class Main {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Alice", 25, 50000));
        employees.add(new Employee(102, "Bob", 30, 45000));
        employees.add(new Employee(103, "Charlie", 28, 60000));
        employees.add(new Employee(104, "David", 22, 40000));

        Collections.sort(employees);

        for(Employee emp : employees){
            System.out.println(emp);
        }
    }
}