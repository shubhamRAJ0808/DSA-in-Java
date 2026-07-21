public class p4 {
    public static int fun(int n){
        if (n<10){
            System.out.println(n%10);
        }
        else{
            System.out.println(n%10);
            fun(n/10);
            System.out.println(n%10);
        }
    }
    public static void main(String[] args) {
        fun(351274);
    }
    
}
