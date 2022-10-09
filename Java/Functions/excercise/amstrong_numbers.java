package Functions.excercise;

public class amstrong_numbers {
    public static void main(String[] args) {
        System.out.println(am_num(153));
        all_amstrong();
    }
    static boolean am_num(int num){
        int n = num;
        int res = 0;
        while(n!=0){
            res = (int) (res + Math.pow((n%10),3));
            n = n/10;
        }
        return res == num;
    }
    static void all_amstrong(){
        for(int i = 100;i<1000;i++){
            if(am_num(i)){
                System.out.println(i);
            }
        }
    }
}
