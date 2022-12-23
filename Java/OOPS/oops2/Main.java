

class Main {
  public static void main(String[] args) {

    Human vijay = new Human("Vijay Benz",18,"Azhe ilaayaam");
    
    System.out.println(vijay.age);
    System.out.println(Human.total);
    hello();
    Static s = new Static();
    System.out.println(s.a);


    //all three objects are referin same variable hence singletn class
    SingletonClass obj1 = SingletonClass.getInstance();
    SingletonClass obj2 = SingletonClass.getInstance();
    SingletonClass obj3 = SingletonClass.getInstance();
  }
  /*without static,it will not run beacause you cannot
   access static method from static main*/
  static void hello(){
      System.out.println("Hello World");
  }
}
