import java.util.ArrayList;
import java.util.List;

public class subsequenceusingIteration {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(subset(arr));
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            int n = list.size();
            for(int j=0;j<n;j++){
                List<Integer> internal = new ArrayList<>(list.get(j));
                internal.add(arr[i]);
                list.add(internal);
            }
        }
        return list;
    }
}
