public class practice1 {

    public static int fun(int n) {
        System.out.println("hello");

        if (n == 0) {
            return 0;
        }

        return fun(n >> 2);
    }
    public static void main(String[] args) {
        fun(32);
    }

    
}