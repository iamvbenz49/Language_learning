class segmentTree {

        public static void main(String[] args) {
            int[] arr = {10,30,20,50,70,90,45};
            segmentTree st = new segmentTree(arr);
            st.display();
            System.out.println(st.get(4,5));
            System.out.println(st.get(2,4));
            System.out.println(st.get(1,4));
            st.update( 0, 1);
            st.display();
        }
        private class Node{
            int data;
            int startInterval;
            int endInterval;
            Node left;
            Node right;
            Node(int startInterval,int endInterval){
                this.startInterval = startInterval;
                this.endInterval = endInterval;
            }
            Node(int startInterval,int endInterval,int data){
                this.startInterval = startInterval;
                this.endInterval = endInterval;
                this.data = data;
            }
        } 
        Node root;
        private int[] arr;
        segmentTree(int[] nums){
            this.root = constructTree(nums, 0, nums.length-1);
        }
        private Node constructTree(int[] nums,int start,int end){
            if(start==end){
                Node node = new Node(start,start,nums[start]);
                return node;
            }
            Node node = new Node(start,end);
            
            int mid = start + (end-start)/2;
           // System.out.println(start+" "+end);
            node.left = constructTree(nums, start, mid );
            node.right = constructTree(nums, mid+1, end);
          //  System.out.println(node.left.data+" "+node.right.data);
            node.data = node.left.data + node.right.data; 
            return node;
        }
        public void display(){
            display(this.root);
        }
        public void display(Node node){
            if(node==null){
                return;
            }
            System.out.println("Interval : " + node.startInterval +" to "+node.endInterval +"  Data : " + node.data);
            if(node.left!=null){
                display(node.left);
            }
            if(node.right!=null){
                display(node.right);
            }
        }
        public int get(int start,int end){
            return get(root, start, end);
        }
        public int get(Node node,int start, int end){
            if(start<=node.startInterval && end>=node.endInterval){
                return node.data;
            }
            else if(end<node.startInterval||start>node.endInterval){
                return 0;
            }
            return get(node.left,start,end) + get(node.right,start,end);
        }
        public void update(int index,int value){
            update(root,index,value);
        }
        private int update(Node node,int index,int value){
            if(index>=node.startInterval && index<=node.endInterval){
                if(index==node.startInterval && index==node.endInterval){
                    node.data = value;
                    return node.data;
                }else{
                    int left = update(node.left,index,value);
                    int right = update(node.right,index,value);

                    node.data = right+left;

                    return node.data;
                }
            }
            return node.data;
        }
}
