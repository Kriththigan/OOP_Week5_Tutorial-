import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class countryCapital {
    public static void main(String[] args){
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");
        capitals.put("India", "New Delhi");
        capitals.put("Japan", "Tokyo");
        capitals.put("France", "Paris");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a cpuntry:");
        String country = input.nextLine();

        if(capitals.containsKey(country)){
            System.out.println("Capital of" + country + "is" + capitals.get(country));
        } else {
            System.out.println("Country not found in the map.");
        }
    }
}
