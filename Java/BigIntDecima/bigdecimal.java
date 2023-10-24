import java.math.BigDecimal;

public class bigdecimal {
    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("15555555555555555555555555555523.44");
        BigDecimal y = new BigDecimal("123.42155555555555555555555555555554");
        System.out.println(x.add(y));
    }
}
