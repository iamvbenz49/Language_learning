import java.util.ArrayDeque;
import java.util.Deque;


public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(40);
        deque.add(30);
        deque.add(20);
        System.out.println(deque.remove());
    }
}
