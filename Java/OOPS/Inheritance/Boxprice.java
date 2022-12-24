public class Boxprice extends BoxWeight{

  
    double cost;

    Boxprice(){
        super();
        this.cost = -1;
    }
  
    Boxprice(BxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public Boxprice(double l,double h,double w,double weight,duble cost){
        super(l,h,w,weight);
        this.cost;
    }
}
