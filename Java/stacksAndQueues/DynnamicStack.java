public class DynnamicStack extends customStack{
    public DynnamicStack(){
        super();
    }
    public DynnamicStack(int size){
        super(size);
    }
    @Override
    public boolean push(int item){
        if(this.isFull()){
            //double arr size
            int[] temp = new int[data.length-1];

            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data = temp;
            return true;
        }
        
        return super.push(item);
    }
    
}
