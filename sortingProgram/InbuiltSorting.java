import java.util.Arrays;

public class InbuiltSorting {
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={22,1,11,2,88,13};
        
        Arrays.sort(arr); 

        // This is the program for the some index
        //Arrays.sort(arr,0,4);
        printArr(arr);
    }
    
}

// For reversing the array
/*import java.util.collection;
Arrays.sort(arr,collection.reverseOrder());
This is for the some index.
Arrays.sort(arr,si,ei,collection.reverseOrder()) */
