public class p3 {
    public static void print(int n){
        System.out.println("hello");
        if(n++ == 0){
            return;
        }
        print(n);
        n++;
    }
    public static void main(String[] args) {
        print(-4);
    }
    
}
