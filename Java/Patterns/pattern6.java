package Patterns;

public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for(int i =0;i<2*n;i++){
            int j;
            if(i<n){
                j = i;
            }
            else{
                j = (2*n)-i;
            }
            for(int l=0;l<n-j;l++){
                System.out.print(" ");
            }
            for(int k =0;k<j;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
