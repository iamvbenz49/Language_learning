public class Main {
    public static void main(String[] args) {
        linkedList Ll = new linkedList();
        Ll.insertFirst(10);
        Ll.insertFirst(20);
        Ll.insertFirst(34);
        Ll.insertFirst(54);
        Ll.insertLast(23);
        Ll.deleteFirst();
        Ll.delete(2);
        Ll.insert(32, 3);
        Ll.display();

        doublyLinkedList dll = new doublyLinkedList();
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.insertFirst(34);
        dll.insertFirst(54);
        dll.insertLast(87);
        dll.insert(21, 34);
        dll.display();
    }
}
