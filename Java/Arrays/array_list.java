package Arrays;

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(7);
        System.out.println(list);

        //contains
        System.out.println(list.contains(0));
        //set
        list.set(0,78);
        System.out.println(list);
        //remove
        list.remove(2);
        System.out.println(list);
    }
}
