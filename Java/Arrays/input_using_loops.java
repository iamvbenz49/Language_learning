package Arrays;

import java.util.Scanner;

public class input_using_loops {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        //foreach loop
        for(int i: arr){
            System.out.println(i);
        }
    }
}
