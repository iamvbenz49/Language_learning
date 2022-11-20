public class noOfDigitsInBase {
    public static void main(String[] args) {
        System.out.println(no_of_digits(1243, 2));
    }
    static int no_of_digits(int n,int b){
        return (int)(Math.log(n)/Math.log(b))+10;
    }
}
