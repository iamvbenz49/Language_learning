public class find_number_found_once {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(unique(arr));
    }
    static int unique(int[]arr){
        int unique = 0;
        for(int i:arr){
            unique^=i;
        }
        return unique;
    }
}
