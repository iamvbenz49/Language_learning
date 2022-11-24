public class PalindromeNumberwithoutrecursion {
    public static void main(String[] args) {
        System.out.println(palin(122321, 5));
    }
    static boolean palin(int n,int lenN){
        int s = 0;
        int e = lenN;
        int i =0;
        while(i<lenN/2){
            int curS = (int) (n/(Math.pow(10,lenN-1)));
            int curE = n%10;
            if(curE == curS){
                n = (int) (s - Math.pow(10,lenN-1));
                n/=10;
            }
            else{
                return false;
            }
            i++;
        }
        return true;
    }
}
