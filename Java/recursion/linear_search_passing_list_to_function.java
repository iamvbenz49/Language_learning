import java.util.ArrayList;

public class linear_search_passing_list_to_function {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,2,2,2,43,3,5,6,2};
        System.out.println(linearSearch(arr, 2, 0,list));
    }

    static ArrayList linearSearch(int[] arr,int target,int i,ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        else if(arr[i]==target){
            list.add(i);
        }
        return linearSearch(arr, target, i+1,list);
    }
}
