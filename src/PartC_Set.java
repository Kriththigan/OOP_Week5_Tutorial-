import java.util.HashSet;
import java.util.Set;
public class PartC_Set {
    public static void main(String[] args){
        Set<Integer> ids = new HashSet<>();
        ids.add(101);
        ids.add(102);
        ids.add(103);
        ids.add(104);
        ids.add(103);
        ids.add(101);
        ids.add(105);
        ids.add(106);

        System.out.println("Students ID:" + ids);
    }
}
