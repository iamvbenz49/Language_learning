public class reverseNumbers {
    public static void main(String[] args) {
        System.out.println(reverse(123,2));
    }
    static int reverse(int n,int base){
        if(n==0){
            return 0;
        }
        return (int) (n%10*Math.pow(10,base)+reverse(n/10, base-1));
    }
}
