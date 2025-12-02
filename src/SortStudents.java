import java.util.Arrays;
public class SortStudents {
    public static void main(String[] args){
        Student[] students = new Student[4];

        students[0] = new Student("Alex", 75);
        students[1] = new Student("Maria", 92);
        students[2] = new Student("John", 60);
        students[3] = new Student("Sofia", 88);

        Arrays.sort(students);

        System.out.println("Students sorted by grade:");
        System.out.println(Arrays.toString(students));
    }
}
