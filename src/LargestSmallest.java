public class LargestSmallest {
    public static void main(String[] args){
        int[] num = {45, 12, 89, 3, 56, 78};
        int largest = num[0];
        int smallest = num[0];

        for(int i=1; i < num.length; i++){
            if(num[i] > largest){
                largest = num[i];
            }
            if(num[i] < smallest){
                smallest = num[i];
            }
        }
        System.out.println("Largest value:" + largest);
        System.out.println("Smallest value:" + smallest);
    }
}
