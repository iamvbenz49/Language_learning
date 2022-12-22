import java.util.Arrays;

public class Main {
    
public static void main(String[] args) {
      Student vijay;//this happens at compile time
      vijay = new Student("Vijay",12,124.4f);//happens at runtime
      vijay.changeName("Hey");
      System.out.println(vijay.marks);
      vijay.greet();
  }
  
}
class Student{
      int rn;
      String name;
      float marks=7.3f;
  
    Student(String s,int rn,float m){//for cons with 0 args
      this.name =s;
      this.rn = rn;
      this.marks = m;
    }
  
    Student(){//for cons with no args
      this.name ="hehe";
      this.rn = 34;
      this.marks = 5.3f;
    }

    Student(Student other){
      this.name =other.name;
      this.rn = other.rn;
      this.marks =other.marks;
      /*
          while calling the other object in current object
          Student s1 = new Student();
          Student s2 = new Student(Student s1);
      */
    }
    void greet(){
      System.out.println("Hello!! "+name);
    }

    void changeName (String s){
      this.name = s;
    }
}
