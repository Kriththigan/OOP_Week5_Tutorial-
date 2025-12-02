import java.util.HashSet;
import java.util.Set;

public class HashSetRandom {
    public static void main(String[] args){
        Set<Integer> numbers = new HashSet<>();
        for(int i = 0; i < 10; i++){
            int random = (int)(Math.random() * 10);
            numbers.add(random);
        }
        System.out.println("Hashset Numbers:" + numbers);
    }
}
