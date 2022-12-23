public class wrapper{
  public static void main (String[] args){
        //int is primitive datatype
        int k  = 10;
        //Integer is a object
        Integer a =45;
        Integer b= 7;
        //another way to create an object
        System.out.println(a);
        swap(a,b);
        System.out.println(a+" "+b);

         //this is possible
         final A x = new A();
         x.rn = 12;

        /*but this is not possible
       x = new A();
       when an object is final you             can't reassign it*/

  }
  static void swap(Integer a,Integer b){
    Integer temp = a;
    a = b;
    b = temp;
    System.out.println(a+" "+b);
  }
}

class A{
  String name = "vj";
  int rn = 12;
}
