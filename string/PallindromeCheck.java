import java.util.Scanner;

public class PallindromeCheck {
    public static boolean isPallindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                // Not a pallindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("The String is Pallindrome: "+isPallindrome( str));
        sc.close();

    }
    
}
