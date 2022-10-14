package LinearSearch;

import java.util.Scanner;

public class search_in_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String s = in.nextLine();
        System.out.print("Enter the element to search : ");
        char element = in.nextLine().charAt(0);
        if(search(s, element) != -1){
            System.out.println("the element is at index : "+search(s,element));
        }
        else{
            System.out.println("Element not found");
        }
    }
    static int search(String str,char ele){
        if(str.length() == 0){
            return -1;
        }
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == ele){
                return i;
            }
        }
        return -1;
    }
}
