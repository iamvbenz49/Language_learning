package excercise;

import java.util.Scanner;

public class weekend_weekdays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day : ");
        String day = in.next();

        switch(day){
            case "sunday":
                System.out.println("weekend");
                break;
            case "monday":
                System.out.println("weekday");
                break;
            case "tuesday":
                System.out.println("weekday");
                break;
            case "wednesday":
                System.out.println("weekday");
                break;
            case "thursday":
                System.out.println("weekday");
                break;
            case "friday":
                System.out.println("weekday");
                break;
            case "saturday":
                System.out.println("weekend");
                break;
            default:
                System.out.println("You are a Dumbfuck!!");
        }
    }
}
