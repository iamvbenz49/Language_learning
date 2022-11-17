public class oddEven {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(isOdd(n));
    }
    static int isOdd(int n){
        return n&1;
    }
}
