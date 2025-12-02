import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();
        queue.add("Customer A");
        queue.add("Customer B");
        queue.add("Customer C");
        queue.add("Customer D");
        queue.add("Customer E");

        System.out.println("Initial Queue:" + queue);

        queue.remove();
        queue.remove();

        System.out.println("Queue after removing 2 elements:" + queue);
    }
}
