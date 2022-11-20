public class pascalTriangle {
    public static void main(String[] args) {
        System.out.println(pascalt(5));
    }
    static int pascalt(int n){
        return (int) Math.pow(2,n-1);
    }
}
