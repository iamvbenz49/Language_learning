public class prodOfDigits {
    public static void main(String[] args) {
        System.out.println(function(7437));
    }
    static int function(int n){
        if(n==0){
            return 1;
        }
        int sum = 1;

        sum = n%10 *sum;


        return sum*function(n/10);
    }
}
