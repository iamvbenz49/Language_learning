public class fibonacciNumbers {
    public static void main(String[] args) {
       System.out.println(fibonacciNumber(7));
    }
    static int fibonacciNumber(int n){
        if(n<=0){
            return n;
        }
        return (n-1) + (n-2);
    }
}
