public class ArrayPairs {
    public static void Pairs(int num[]){
        int Total_pairs = 0;
        for(int i=0; i<num.length;i++){
            int curr = num[i];
            for(int j=i+1; j<num.length;j++){
                System.out.print("(" + curr + " , " + num[j]+")");
                Total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+ Total_pairs);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        Pairs(num);

    }
    
}
