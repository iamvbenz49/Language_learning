package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class two_dimension_array {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9 
         */
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[][] arr2d = {
            {1,2,3},
            {4,5,6},
            {7,8,9}};
        System.out.println(Arrays.deepToString(arr2d));
        for(int i = 0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
