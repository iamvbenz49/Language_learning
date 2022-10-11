package Arrays.excercise;

public class maximum_of_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int m = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>m){
                m = arr[i];
            }
        }
        return m;
    }
}
