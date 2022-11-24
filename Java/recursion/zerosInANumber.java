public class zerosInANumber {
    public static void main(String[] args) {
        System.out.println(ZNumber(2001200082));
    }
    static int ZNumber(int n){
        if (n==0){
            return 0;
        }
        return (n%10==0?1:0)+ZNumber(n/10);
    }
}
