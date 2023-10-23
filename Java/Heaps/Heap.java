import java.util.ArrayList;
import java.util.List;

public class Heap {
    private int size;
    List<Integer> heap;
    Heap(){
        this.heap = new ArrayList<>();
        this.size = 0;
    }
    private int findParent(int index){
        return index/2;
    }
    private int findLeft(int index){
        return (2*index)+1;
    }
    private int findRight(int index){
        return (2*index)+2;
    }
    public int get(){
        if(size==0)
            return Integer.MIN_VALUE;
        int res = heap.get(0);
        this.display();
        heap.set(0,heap.remove(size-1));
        size--;
        removeHelper(0, findLeft(0), findRight(0));
        return res;
    }
    public void removeHelper(int parent,int left,int right){
        if(left>=size||right>=size||(heap.get(parent)>heap.get(left)&&heap.get(parent)>heap.get(right)))
            return;
        if(heap.get(left)>heap.get(right)){
            swapNodes(left, parent);
            removeHelper(left, findLeft(left), findRight(left));
        }else{
            swapNodes(right, parent);
            removeHelper(right, findLeft(right), findRight(right));
        }
    }
    public void add(int val){
        heap.add(val);
        size++;
        addHelper(size-1, findParent(size-1));
    }
    private void addHelper(int child,int parent){
        if(child==0){
            return;
        }
        if(heap.get(child)>heap.get(parent)){
            swapNodes(child, parent);
            addHelper(parent, findParent(parent));
        }
    }
    private void swapNodes(int node1,int node2){
        int temp = heap.get(node1);
        heap.set(node1,heap.get(node2));
        heap.set(node2,temp);
    }
    public void display(){
        System.out.println(heap);
    }
    public boolean isEmpty(){
        return size==0;
    }
    public List<Integer> heapSort(){
        ArrayList<Integer> list = new ArrayList<>();
        while(!this.isEmpty()){
            list.add(this.get());
        }
        return list;
    } 
}
