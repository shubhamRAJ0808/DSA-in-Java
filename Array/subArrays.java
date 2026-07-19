public class subArrays {
    public static void PrintSubArrays(int num[]){
        int Total_pairs = 0;
        for(int i=0;i<num.length;i++){
            int start = i;
            for(int j=i; j<num.length;j++){
                int end = j;
                for (int k=start; k<=end;k++){
                    System.out.print(num[k]+" ");
                }
                Total_pairs++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("Total subarrays: "+Total_pairs);
    }
    public static void main(String[] args) {
        int num[]= {2,4,6,8,10};
        PrintSubArrays(num);
    }
    
}
