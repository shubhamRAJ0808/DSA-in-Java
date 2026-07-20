import java.util.Scanner;

public class shortestPath {
    public static float getShortestPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            // south
            if(dir=='s'){
                y--;
            }
            else if(dir=='n'){
                y++;
            }
            else if(dir=='e'){
                x++;

            }
            else if(dir=='w'){
                x--;
            }
                
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a direction: ");
        String path = sc.nextLine();

        float distance= getShortestPath(path);
        System.out.println("The given path is: "+distance);
        sc.close();


    }

    
}
