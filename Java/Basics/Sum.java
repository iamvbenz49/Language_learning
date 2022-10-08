import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        float sum = (float)(num1) + (float)(num2); //typecasting
        System.out.println("The sum is " + sum);

    }
}
