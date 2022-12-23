class Main {
  public static void main(String[] args) {
    B vj;
    for(int i=0;i<10000000;i++){
      vj= new B();
    }
  }
}
class B{
      int a = 10;
      @Override
      protected void finalize() throws Throwable{
          System.out.println("hello");
      }
}
