public class nthmagicnumber {
    public static void main(String[] args) {
        System.out.println(nthMagic(6));
    }
    static int nthMagic(int n){
        int s = 0;
        int base =1;
        while(n>0){
            int last = n&1;
            s += (int) Math.pow(5, base)*last;
            n = n>>1;
            base++;
        }
        return s;
    }
}
