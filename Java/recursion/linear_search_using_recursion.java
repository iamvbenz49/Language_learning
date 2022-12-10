public class linear_search_using_recursion {
    public static void main(String[] args) {
        
    }
    static int linearSearch(int[] arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        else if(arr[i]==target){
            return i;
        }
        return linearSearch(arr, target, i+1);
    }
}
