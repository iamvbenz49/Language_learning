package Patterns;

public class pattern4 {
    public static void main(String[] args) {
        /*
            1 
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */
        for(int i=1;i<6;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
