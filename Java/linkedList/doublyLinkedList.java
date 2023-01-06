public class doublyLinkedList {

    Node head;

    public void insertFirst(int val){

        Node node = new Node(val);

        node.next = head;
        node.prev = null;


        if(head!=null){head.prev = node;}

        head = node;
    }

    public void display(){

        Node node = head;
        Node last = null;

        while(node!=null){
            System.out.print(node.val+"<-->");
            last = node;
            node = node.next;
        }

        System.out.println("Reverse Printing");
        while(last!=null){
            System.out.print(last.val+"<-->");  
            last = last.prev;
        }
    }

    public void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        node.next = null;  
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        temp.next.prev = temp;

    }
    
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int val, int after) {
        Node p = find(after);
        if(p==null){
            return;
        }
        Node node = new Node(val);
        
       
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){node.next.prev = node;} 
    }

    private class Node{
        int val;
        Node next;
        Node prev;  

        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
