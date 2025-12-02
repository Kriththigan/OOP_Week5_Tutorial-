import java.util.LinkedList;
import java.util.Queue;

public class QueueFrontCheck {
    public static void main(String[] args){
        Queue<Integer> numbers = new LinkedList<>();
        if(numbers.isEmpty()){
            System.out.println("Queue Empty");
        }
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Front elements:" + numbers.peek());
        System.out.println("Current Queue:" + numbers);
    }
}
