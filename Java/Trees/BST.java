public class BST {
    private static class Node {
        int value;
        private Node left;
        private Node right;
        private Node height;
        public Node(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
    private Node root;
    public int height(Node node) {
        if(node==null) {
            return -1;
        }
        return height;
    }
    public boolean isEmpty() {
        return root==null;
    }
    public TreeNode insert(Node root,int key) {
        if(root==null) {
            return new Node(key);
        }
        if(root.val>key) {
            root.left = insert(root.left,key);
        } else {
            root.right = insert(root.right,key);
        }
        return root
    }
}
