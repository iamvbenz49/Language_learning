public class Human {
    String Name;
    int age;
    String gfName;
    static int total;
    Human(String name,int age,String gfName){
        this.Name = name;
        this.age = age;
        this.gfName = gfName;
        Human.total+=1;
    }
}
