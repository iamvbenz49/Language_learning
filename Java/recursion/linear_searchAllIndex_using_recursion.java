import java.util.ArrayList;

public class linear_searchAllIndex_using_recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,2,2,2,43,3,5,6,2};
        linearSearch(arr, 2, 0);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void linearSearch(int[] arr,int target,int i){
        if(i==arr.length-1){
            System.out.println(list);
            return;
        }
        else if(arr[i]==target){
            list.add(i);
        }
        linearSearch(arr, target, i+1);
    }
}
