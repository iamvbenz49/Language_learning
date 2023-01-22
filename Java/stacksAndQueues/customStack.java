public class customStack {
    protected int[] data;
    private static final int size = 10;

    int ptr = -1;

    public customStack(){
        this(size);
    }

    public customStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack Overflow");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("STACK UNDERFLOW!!!");
        }
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("cant peek from EMPTY STACK");
        }
        return data[ptr];
    }
    public boolean isFull() {
        return ptr==data.length-1;
    }
    public boolean isEmpty() {
        return ptr==-1;
    }
}
