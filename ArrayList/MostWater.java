import java.util.ArrayList;

public class MostWater {

    // BruteForce o(n^2)
    public static int StoreWater(ArrayList<Integer> height){
        int maxwater = 0;
        for(int i=0; i<height.size();i++){
            for(int j=i+1; j<height.size();j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht * width;
                maxwater = Math.max(maxwater, currWater);
            }
        }
        return maxwater;
    }

    // two pointer approach

    public static int isStoreWater(ArrayList<Integer> height){
        int maxwater = 0;
        int lp = 0;
        int rp = height.size()-1;
        while(lp<rp){
            // calculate the area of the water
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht * width;
            maxwater = Math.max(maxwater, currWater);

            // Update the pointer on the basis of the height
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;

    }
    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("BrureForce: "+ StoreWater(height));
        System.out.println("Two Pointer approach: "+ isStoreWater(height));
    }

    
}
