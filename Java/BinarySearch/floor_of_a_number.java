package BinarySearch;

public class floor_of_a_number {
    public static void main(String[] args) {
        int[] arra = {2,3,5,9,14,16,18};
        System.out.println(search(arra, 25));
    }
    static int search(int[] arr,int target){
        if(target<arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(end>=start){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else if(target == arr[mid]){
                return arr[mid];
            }
        }
        return arr[end];
    }
}
