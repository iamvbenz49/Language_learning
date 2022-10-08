package excercise;

public class rev_num {
    public static void main(String[] args) {
        int num = 2398;
        int res= 0;
        int i = 1000;
        while(num>0){
            res = res + i*(num%10);
            num=num/10;
            i = i/10;
        }
        System.out.println(res);
    }
}
