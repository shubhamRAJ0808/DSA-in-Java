public class p2 {

    static int a =2;

    public static int fun(int n){
        int b = 3;
        if(n==0){
            return 0;
            
        }
        b=a++;
        return fun(n-1)+a+b;
    }
    public static void main(String[] args) {
        System.out.println(fun(3));
    }
    
}
