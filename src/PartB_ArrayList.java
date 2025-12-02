import java.util.ArrayList;

public class PartB_ArrayList {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Maria");
        names.add("John");
        names.add("Smith");
        names.add("Patrick");

        names.remove(2);
        names.add(1,"William");

        System.out.println("Updated name list:" + names);
    }
}
