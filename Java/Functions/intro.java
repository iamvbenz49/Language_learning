package Functions;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        //Question: add two numbers
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = in.nextInt();
        System.out.println("Enter number 2");
        int b = in.nextInt();
        System.out.println(a+b);
    }
}
