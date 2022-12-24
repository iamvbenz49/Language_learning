public class BoxWeight extends Box{
  
    double weight;

     BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double l,double h,double w,double weight){
        super(l,h,w);//call the parent class constructor
      
        this.weight = weight;
    }
    void printd(){
        System.out.println("l : "+this.l+", w : "+this.w+", h : "+this.h+", weight : "+this.weight);
    }

}
