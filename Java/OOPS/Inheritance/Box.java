public class Box{

  
    double l;
    double w;
    double h;

    Box(){
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }
  
    Box(double l,double w,double h){
        this.h = h;
        this.w = w;
        this.l = l;
    }
  
    Box(double l){
        this.h = l;
        this.w = l;
        this.l = l;
    }
  
    Box(Box other){
        this.h = other.h;
        this.w = other.w;
        this.l = other.l;
    }
}
