import java.util.ArrayList;

public class subsequences {
    public static void main(String[] args) {
       System.out.println( subsequenceUsingArrayList("", "abc"));
       sub("", "abcf");
    }
    static void sub(String p,String up){
        if(up==""){
            System.out.print(p+" ");
            return;
        }
        sub(p+up.charAt(0),up.substring(1));
        sub(p,up.substring(1));
    }
    static ArrayList<String> subsequenceUsingArrayList(String p,String up){
        ArrayList<String> list = new ArrayList<>();
        if(up==""){
           list.add(p);
           return list;
        }
        list.addAll(subsequenceUsingArrayList(p+up.charAt(0),up.substring(1)));
        list.addAll(subsequenceUsingArrayList(p,up.substring(1)));
        return list;

    }
}
