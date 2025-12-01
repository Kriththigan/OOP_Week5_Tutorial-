import java.util.ArrayList;

public class Array {
    public static void main(String[] args){
        ArrayList<String> band = new ArrayList();
        band.add ("Paul");
        band.add("John");
        band.add("George");
        band.add("Peter");
        System.out.println(band);

        int loaction  = band.indexOf("Peter");
        band.remove(loaction);

        System.out.println (band);
        System.out.println ("At index 1:" + band.get(1));

        band.add(2, "Ringo");

        System.out.println(band);
        System.out.println("Size:" + band.size());
    }
}