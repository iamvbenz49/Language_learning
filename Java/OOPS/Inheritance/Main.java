class Main {
  public static void main(String[] args) {

      Box box = new Box();
      System.out.println(box.l+" "+box.w+" "+box.l);

      BoxWeight b3 = new BoxWeight();
      System.out.println(b3.h+" "+b3.weight);

      BoxWeight b4 = new BoxWeight(1.9,2.3,3.5,4.7);
      b4.printd();

      BoxPrice box = new BoxPrice();
  }
}
