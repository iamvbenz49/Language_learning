package LinearSearch;

public class search_in_range {
    public static void main(String[] args) {
        int[] array = [9,7,3,4,5,3,2,1,5];
        int target = 4;
        if(search(1,6,array,target) !=1){
            System.out.println("The element is at index " + search(1,6,array,target));
        }
        else{
            System.out.println("element not found");
        }
    }
    static int search(int start,int end,int[] arr,int target){
        for(int i = start;i<end;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
