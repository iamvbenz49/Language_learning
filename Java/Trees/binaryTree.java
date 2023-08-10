import java.util.Scanner;

public class BinaryTree {
    private static class Node {
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;
    //insert
    public void populate(Scanner sc) {
        System.out.print("Enter the root Node : ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc,root);
    }
    public void populate(Scanner sc,Node node) {
        System.out.println("Do you wanna eneter the left of "+node.value);
        boolean left = sc.nextBoolean();
        if(left) {
            System.out.println("enter the left value of "+node.value);
            node.left = new Node(sc.nextInt());
            populate(sc,node.left);
        }
        System.out.println("Do you wanna eneter the right of "+node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("enter the right value of "+node.value);
            node.right = new Node(sc.nextInt());
            populate(sc,node.right);
        }
    }
    public void display() {
        display(root,"");
    }
    public void display(Node node,String indent) {
        if(node==null) {
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        System.out.println("enter");
        tree.display();
    }
}
