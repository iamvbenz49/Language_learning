package excercise;

public class no_off_coocurences {
    public static void main(String[] args) {
        int num = 13263421;
        int res = 0;
        while(num>0){
            if(num%10 == 1){
                res+=1;
            }
            num=num/10;
        }
        System.out.println(res);
    }
}
