import java.util.ArrayList;

public class ArrayListReplace {
    public static void main(String[] args){
        ArrayList<Integer>values = new ArrayList<>();
        values.add(5);
        values.add(10);
        values.add(15);
        values.add(20);
        values.add(25);

        values.add(2, 65);
        values.set(4, 123);
        System.out.println("Updated List:" + values);
    }
}
