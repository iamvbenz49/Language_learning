package Patterns;

public class pattern5 {
    public static void main(String[] args) {
        int n = 8;
        for(int i=0;i<2*n;i++){
            int j;
            if(i<=n){
                j = i;
            }
            else{
                j = 2*n-i;
            }
            for(int k=0;k<j;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
