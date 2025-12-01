import java.util.ArrayList;

public class ArrayListNames {
    public static void main(String[] args){
        ArrayList<String>names = new ArrayList<>();
        names.add("John");
        names.add("Alex");
        names.add("Maria");
        names.add("Peter");
        names.add("Sarah");

        names.remove(2);
        System.out.println("Final List" + names);
        System.out.println("List Size:" + names.size());
    }
}
