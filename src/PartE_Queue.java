import java.util.LinkedList;
import java.util.Queue;
public class PartE_Queue {
    public static void main(String[] args){
        Queue<String> q = new LinkedList<>();
        q.add("Kane");
        q.add("Alex");
        q.add("John");
        q.add("Maria");

        q.remove();

        System.out.println("Next Student:" + q.peek());
        System.out.println("Size" + q.size());
        System.out.println("Queue" + q);
    }
}
