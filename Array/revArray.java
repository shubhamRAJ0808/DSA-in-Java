public class revArray {
    public static void ReverseArray(int num[]){
        int first =0, last = num.length-1;

        while (first<last) {
            int temp = num[last];
            num[last]= num[first];
            num[first]= temp;

            first++;
            last--;
            
        }

        
    }
    public static void main(String[] args) {
        int num[] = {1,5,6,7,44,55,77};
        ReverseArray(num);

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    
}
