public class Main {
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(10);
        hp.add(20);
        hp.add(30);
        hp.add(110);
        hp.add(40);
        hp.add(17);
        hp.add(45);
        hp.display();
        System.out.println(hp.get());
        System.out.println(hp.get());
        System.out.println(hp.get());
        hp.display();
        System.out.println(hp.heapSort());
    }
}
