import java.util.ArrayList;

public class BaiscArrayList {
    public static void main(String[] args) {
         // Creation of an ArrayList
    ArrayList<Integer> list = new ArrayList<>();
    // use class like(Integer, String, Float) not primitive data type like(int, float,char)

    // Operation on ArrayList
    // 1. add elements o(1)
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list);

    // add with some index o(n)
    list.add(2,9);
    System.out.println(list);


    
    // 2. get element - get a element index o(1)
    System.out.println(list.get(2));

    // 3. Remove element
    list.remove(2);
    System.out.println(list);

    //4. set-- replace from the index
    list.set(2,10);
    System.out.println(list);

    // 5. contains-- check the element is present in the ArrayList or not
    System.out.println(list.size());

    //Print the ArrayList
    for(int i=0; i<list.size(); i++){
        System.out.println(list.get(i)+" ");
    }
    System.out.println();




    }

    
   

    
}