public class trianglePatternrecursion2 {
    public static void main(String[] args) {
        func(4,0,4);
    }
    static void func(int r,int c,int n){
        if(r==0){
            return;
        }
        else if(c==n){
            System.out.println();
            func(r-1,0,n-1);
        }
        else if(c<n){
            System.out.print("*"+" ");
            func(r,c+1,n);
        }
    }
}
