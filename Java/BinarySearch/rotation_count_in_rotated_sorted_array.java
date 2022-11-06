package BinarySearch;

public class rotation_count_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] array = {13,15,18,2,3,6,12};
        System.out.println(peakIndex(array)+1);
    }
    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid+1]<arr[mid]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
