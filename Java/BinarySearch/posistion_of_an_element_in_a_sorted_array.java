package BinarySearch;

public class posistion_of_element_infinite_sorted_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0,11};
        int target = 8;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(true){
            while(target<arr[end]){
                int mid = start + (end-start)/2;
                if(target>arr[mid]){
                    start = mid+1;
                }
                else if(target<arr[mid]){
                    end = mid-1;
                }
                else if(target == arr[mid]){
                    return mid;
                }
            }
            start = end;
            end=end*2;
        }
    }
}
