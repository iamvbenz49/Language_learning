import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        /*
         * Normal If else
         */
        if(fruit.equals("apple")){
            System.out.println("red fruit");
        }
        else if(fruit.equals("banana")){
            System.out.println("Yellow fruit");
        }
        /*
          Switch cases

          switch(expression){
                case one:
                    break;
                case two:
                    break;
          }
         */
        switch(fruit){
            case "apple":
              System.out.println("Red");
            case "mango":
                System.out.println("Yellow");
                break;
            case "banana":
                System.out.println("Green");
                break;
            case "peach":
                System.out.println("Orange");
                break;
            default:
                System.out.println("Dumbfuck!!!");
                break;
        }

    }
}
