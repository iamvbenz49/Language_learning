package Patterns;

public class pattern3 {
    public static void main(String[] args) {
        /*
           * * * * *
           * * * * 
           * * *
           * * 
           * 
         */
        for(int i=0;i<6;i++){
            for(int j=6-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
