import java.util.Scanner;

public class CharAtMethod {
    // CharAt method is used for the finding position and the index of the string.
    public static void PrintLetters(String str){
        for(int i=0; i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("The Word at index is: "+str.charAt(3));
        PrintLetters(str); 
        sc.close();
        
    }


    
}
