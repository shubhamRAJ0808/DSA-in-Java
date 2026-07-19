public class InsertionSorting {
    public static void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;

            // Finding out the current position to insert.
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // Insertion code
            arr[prev+1]=curr;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {2,5,6,4,3,1};
        InsertionSort(arr);
        printArr(arr);
    }
    
}
