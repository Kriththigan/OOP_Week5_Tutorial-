import java.util.HashSet;
import java.util.Set;
public class setIntersection {
    public static void main(String[] args){
        Set<Integer> setA = new HashSet<>();
        setA.add(10);
        setA.add(20);
        setA.add(30);
        setA.add(40);

        Set<Integer> setB = new HashSet<>();
        setB.add(30);
        setB.add(40);
        setB.add(50);
        setB.add(60);

        Set<Integer> common = new HashSet<>(setA);
        common.retainAll(setB);

        System.out.println(setA);
        System.out.println(setB);
        System.out.println("Common Elements (A ∩ B):" + common);
    }
}
