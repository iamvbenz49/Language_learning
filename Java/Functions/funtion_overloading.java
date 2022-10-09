package Functions;

public class funtion_overloading {
    public static void main(String[] args) {
        func("2w"); //two functions with same name can exits,with number argyement shoud be different or type should be different
    }
    static void func(int a){
        System.out.println(a);
    }
    static void func(String b){
        System.out.println(b);
    }
}
