public class circularQueue {
    int end = 0;
    int front =0;
    private int size =0;
    private static final int DEFAULT = 10;    protected int[] data;
    public circularQueue(){
        this(DEFAULT);
    }

    public circularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull() {
        return end==data.length-1;
    }
    public boolean isEmpty() {
        return end==-1;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end++] = item;
        end = end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[front++];
        front = front%data.length;
        size--;
        return removed;
    }
    public void display(){
        int f =front;
        do{
            System.out.print(data[f]+" ");
            f++;
            f%=data.length;
        }
        while(f!=end);
    }
}
