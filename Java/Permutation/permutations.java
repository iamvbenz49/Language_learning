package Permutation;
import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        permutation("", "abc");
        System.out.println(permutationList("", "abc"));
        System.out.println(permutationCount("", "abc"));
    }
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        for(int i=0;i<=p.length();i++){
            permutation(p.substring(0, i)+up.charAt(0)+p.substring(i), up.substring(1));
        }
    }
    static ArrayList<String> permutationList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            char ch = up.charAt(0);
            String s = p.substring(i);
            list.addAll(permutationList(f+ch+s, up.substring(1)));
        }
        return list;
        
    }
    static int permutationCount(String p,String up){
        int count = 0;
        if(up.isEmpty()){
            return count+1;
        }
        for(int i=0;i<=p.length();i++){
            count = count + permutationCount(p.substring(0, i)+up.charAt(0)+p.substring(i), up.substring(1));
        }
        return count;
    }
}
