import java.util.ArrayList;

import java.util.Collections;

public class BasicToAdvance {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println("Original list: "+list);

        // Also used Collections.min(list) or Collections.max(list) -- Inbuilt Function

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size();i++){
            if(max<list.get(i)){
                max= list.get(i);
            }
        }
        System.out.println("Max Element of the ArrayList is: "+ max);

        int min = Integer.MAX_VALUE;
        for(int i=0; i<list.size();i++){
            if(list.get(i)<min){
                min = list.get(i);
            }
        }
        System.out.println("Min element of the Arraylist is: "+min);

        // Reverse this arraylist or use Collections.reverse(list)
        System.out.print("Reverse List: ");
        for(int i=list.size()-1; i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sorting on Arraylist
        // Inbuilt-- Ascending Order

        Collections.sort(list);
        System.out.println("Ascending Sorted ArrayList: "+ list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Sorted Arraylist: "+ list);

    
        



    }
    
    
}
