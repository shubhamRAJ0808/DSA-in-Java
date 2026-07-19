public class arraycc {
    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i=0;i<marks.length;i++){
            marks[i]= marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int nonChangable = 5;
        int marks[]={97,98,99};
        update(marks,nonChangable);
        System.out.println(nonChangable);

        // for print a marks
        for(int i=0; i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    
}
