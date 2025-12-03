import java.util.HashMap;
import java.util.Map;
public class PartD_Map {
    public static void main(String[] args){
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Ben", 78);
        marks.put("Kevin", 68);
        marks.put("Jon", 77);
        marks.put("Mark", 95);

        System.out.println("Students scoring above 70: ");
        for(String name : marks.keySet()){
            if(marks.get(name) > 70){
                System.out.println(name + " - " + marks.get(name));
            }
        }
        System.out.println("\nAll entries:");
        for(Map.Entry<String, Integer> entry : marks.entrySet()){
            System.out.println(entry.getKey() + " > " + entry.getValue());
        }
    }
}
