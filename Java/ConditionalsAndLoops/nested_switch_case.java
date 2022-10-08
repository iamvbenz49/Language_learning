import java.util.Scanner;

public class nested_switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nst = in.nextInt();
        switch(nst){
            case 1:
                System.out.println("hello 1");
                break;
            case 2:
                System.out.println("hello 2");
                switch(2){
                    case 2:
                        System.out.println("welcome vroo");
                }
                break;
            default:
                System.out.println("You are a Dumbfuck");
        }
    }
    /*
        SYNTAX
        switch(expression){
            case 1:
                switch(expression){
                    case 1:
                    break;
                }
                break;
            default:
                statement;
        }
     */
}
