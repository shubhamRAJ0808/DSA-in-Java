public class BitManipulation {

   
    //check is number is power of two is not?
    public static boolean isPowerOfTwo(int n){
        return n>0 && (n&n-1)==0;

    }
    // get ith Bit -- Checks whether bit at position i is 0 or 1.
    public static int getItsBit(int n, int i){
        int bitMask = (1<<i);
        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }

    }
    // set ith Bit -- Forces bit at position i to become 1.
    public static int setIthBit(int n, int i){
        int bitMask = (1<<i);
        return n|bitMask;
    }
    // clear ith bit-- Makes bit at position i become 0.
    public static int clearItsBit(int n, int i){
        int bitMask =~(1<<i);
        return n & bitMask;
    }
    // Clears last i bits from right side.
    public static int ClearLastIthBit(int n, int i){
        int bitMask = ((~0)<<i);
        return n & bitMask;
    }
    //Clears bits from position i to j.
    public static int ClearRangeIthBits(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println("The Number is power of two: "+isPowerOfTwo(0));
        System.out.println("The number at position is 0 or 1? "+getItsBit(10, 2));
        System.out.println("The SetIth Num is: "+setIthBit(10, 2));
        System.out.println("The clear Bit is: "+clearItsBit(10, 1));
        System.out.println("The Change in last two bits is: "+ClearLastIthBit(15, 2));
        System.out.println("The Range function is: "+ClearRangeIthBits(10, 2, 4));
    }

    
}
