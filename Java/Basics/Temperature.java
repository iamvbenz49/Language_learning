import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in C:");
        int C = input.nextInt();
        float temp = (9/5)*C + 32;
        System.out.println("The temperature in F : "+temp);
    }
}
