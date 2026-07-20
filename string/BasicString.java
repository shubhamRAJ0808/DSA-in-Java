import java.util.Scanner;

public class BasicString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Your name is: " + name);


        // String concenation - merging of the two string
        String FirstName = "Shubham";
        String LastName = "Raj";
        String Fullname = FirstName+" "+LastName;
        System.out.println(Fullname+" is this");

        // Stringlength() is used for the calculating the length of the string.

        System.out.println("Length of String is: "+name.length());

    
        sc.close();

    }
}