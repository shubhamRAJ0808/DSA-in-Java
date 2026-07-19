//import java.util.*;
public class LargestArr {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // use for the the maximum  value
        int smallest = Integer.MAX_VALUE;// use for the minimum value
        for(int i=0; i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number in the array is: "+smallest);
        
        return largest;


    }
    public static void main(String[] args) {
        int number[] = {1,77,55,66,100,88,99};
        System.out.println("The largest number in the array is: "+getLargest(number));
    }
    
}
