import java.util.Arrays;
public class SortIntArray {
    public static void main(String[] args){
        int[] numbers = {25, 18, 5, 42, 10};
        Arrays.sort(numbers);
        System.out.println("Sorted Array:" + Arrays.toString(numbers));
    }
}
