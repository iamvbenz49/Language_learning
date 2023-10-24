import java.math.BigInteger;

public class bigInt {
    public static void main(String[] args) {
        BigInteger A = BigInteger.valueOf(33382);
        BigInteger B = BigInteger.valueOf(21);
        BigInteger C = new BigInteger("3212222221111111111144444444413222");
        BigInteger D = BigInteger.TWO;
        int c = C.intValue();
        System.out.println(A.add(B));
        System.out.println(C.add(D));
        System.out.println(A.multiply(C));
        System.out.println(factorial.fact(12));
    }
}
