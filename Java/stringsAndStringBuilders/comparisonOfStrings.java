package stringsAndStringBuilders;

public class comparisonOfStrings {
    public static void main(String[] args) {
        String a = "vijay";
        String b = "vijay";
        System.out.println(a==b); //a and b are pointing towards same string pool,here False

        //when we use new keyword ,we can create different object of same value
        String x = new String("benz");
        String y = new String("benz");
        System.out.println(x ==y);
        //when we just want to check the value we can use .equals() method,here true
        System.out.println(a.equals(b));
        System.out.println(x.equals(y));
    }
}
