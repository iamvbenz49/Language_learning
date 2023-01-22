public class Main {
    public static void main(String[] args) throws Exception {

        customStack stack = new DynnamicStack(6);

        stack.push(10);
        stack.push(40);
        stack.push(30);
        stack.push(20);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // System.out.println(stack.pop());

        customQueue queue = new customQueue(5);
        
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.display();

        circularQueue cq = new circularQueue(5);
        cq.insert(10);
        cq.insert(20);
        cq.insert(30);
        cq.insert(40);

        cq.display();
    }
}
