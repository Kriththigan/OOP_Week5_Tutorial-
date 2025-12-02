import java.util.HashMap;
import java.util.Map;
public class studentMarks {
    public static void main(String[] args){
        Map<String,Integer> marks = new HashMap<>();
        marks.put("John", 16);
        marks.put("Maria", 92);
        marks.put("Alex", 78);
        marks.put("Sofia", 88);

        System.out.println("Student Marks:");
        for(Map.Entry<String, Integer> entry : marks.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
