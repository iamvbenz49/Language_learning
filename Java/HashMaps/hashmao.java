import java.util.HashMap;
public class hashmao {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Vijay",49);
        map.put("jerome",50);
        map.put("edwin",51);

        System.out.println(map.get("edwin"));
    }
}
