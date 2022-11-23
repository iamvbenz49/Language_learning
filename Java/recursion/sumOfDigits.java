public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(function(7437,1000));
    }
    static int function(int n,int digits){
        if(n==0){
            return 0;
        }
        int sum = 0;

        sum = n/digits + sum;


        return sum+function(n%digits, digits/10);
    }
}
