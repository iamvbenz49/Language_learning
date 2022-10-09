package Functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class var_args {
    public static void main(String[] args) {
        main(1,2,3,3,4);
    }
    static void main(int ...x){
        System.out.println(Arrays.toString(x));
    }
}
