public class oddEven {
    public static void OddOrEven(int n){
        int BitMask =1;
        if((n & BitMask)==0){
            // even number
            System.out.println("Even Number");

        }
        else{
            System.out.println("Odd number");
        }
    }
   public static void main(String args[]){
    OddOrEven(3);
    OddOrEven(4);
    OddOrEven(11);
    OddOrEven(12);
   }

}