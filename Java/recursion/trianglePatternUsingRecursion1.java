public class trianglePatternUsingRecursion1 {
    public static void main(String[] args) {
        mainf(5);
    }
    static void sidef(int n){
        if(n==0){
            System.out.println();
            return;
        }
        System.out.print(n+" ");
        sidef(n-1);
    }
    static void mainf(int n){
        if(n==0){
            return;
        }
        sidef(n);
        mainf(n-1);
    }
}
