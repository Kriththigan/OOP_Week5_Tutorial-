public class Employee implements Comparable <Employee> {
    private int id;
    private String name;
    private int age;
    private int salary;

    public Employee(int id, String name, int age, int salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public long getSalary(){
        return salary;
    }
    public String toString(){
        return "Employee name = " + name + ", id = " + id + ", age = " + age + ", salary = " + salary + "\n";
    }
    @Override
    public int compareTo(Employee emp){
        return (this.salary - emp.salary);
    }
}
