import java.util.Arrays;
public class Mark {
    public static void main(String[] args){
        int[] marks = {45, 80, 56, 45, 78, 89, 67, 88, 50, 90};
        int highest = marks[0];
        int lowest = marks[0];
        for(int m : marks){
            if(m > highest) highest = m;
            if(m < lowest) lowest = m;
        }
        System.out.println("Highest:" + highest);
        System.out.println("Lowest:" + lowest);

        Arrays.sort(marks);
        System.out.println("Sorted Array:" + Arrays.toString(marks));

        int index = Arrays.binarySearch(marks, 50);
        System.out.println("Index of 50:" + index);
    }
}
