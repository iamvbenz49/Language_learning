package LinearSearch;

import java.util.Arrays;

public class search_in_2d_arrays {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,4},
            {7,9,0},
            {5,8,3}};
        System.out.println("the search element is at " + Arrays.toString(search(arr, 7)));

    }
    static int[] search(int[][] array,int target){
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                if(array[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
