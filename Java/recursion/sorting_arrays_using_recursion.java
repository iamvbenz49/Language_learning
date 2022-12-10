public class sorting_arrays_using_recursion {
    public static void main(String[] args) {
        //TEST CASE 1
        int[] arr = {1,2,4,5,1,7,8,9};//true
        System.out.println(sArraysRecursion(arr, 0)); 
        //TESTCASE 2
        /*
          int[] arr = {1,2,4,5,6,7,8,9};//false
         */
    }
    static boolean sArraysRecursion(int[] arr,int i){
        if(arr.length-1==i){
            return true;
        }
        return arr[i]<arr[i+1] && sArraysRecursion(arr, i+1);
    }
}
