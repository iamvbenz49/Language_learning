package stringsAndStringBuilders;

public class palindrome {
    public static void main(String[] args) {
        String s = "malayaljam";
        System.out.println(palindrom(s));
        

    }
    static boolean palindrom(String s){
        for(int i = 0;i<s.length()/2;i++){
            if(s.charAt(i) == s.charAt(s.length()-1-i)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
