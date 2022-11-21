public class primeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(18));
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int i = 2;
        while(i*i<n){
            if(n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
