package Functions;

public class scope {
    public static void main(String[] args) {
        //Block Scope
        {
            int a = 1; //values initialised inside the block cannot be used outside
            System.out.println(a);
        }
        //Loop scope
        for(int i =0;i<4;i++){
            System.out.println(i);
        }
    }
}
