import java.util.Scanner;

public class linearSearch {
    public static int search(int arr[], int x){
        for(int i=0; i<arr.length;i++){
            if( arr[i]==x){
                return i;
            }
        }
        return -1; // Not found

    }
    public static void main(String[] args) {
        int array[]= {1,4,5,33,6,7,8,9,4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        int result = search(array, x);
        if(result == -1){
            System.out.println(x + " is not present in the array.");
        }
        else{
            System.out.println(x+" is present in the array.");
        }
        sc.close();

    }
    
}
