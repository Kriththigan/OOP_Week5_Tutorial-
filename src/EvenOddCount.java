public class EvenOddCount {
    public static void main(String[] args){
        int[] numbers = {12, 7, 8, 25, 30, 19, 42, 55, 66, 3};
        int evenCount = 0;
        int oddCount = 0;

        for(int num : numbers){
            if(num % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Total even numbers:" + evenCount);
        System.out.println("Total odd numbers:" + oddCount);
    }
}
