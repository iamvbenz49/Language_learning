public class skipAChar {
    public static void main(String[] args) {
        skip("hello", "",'l');
        System.out.println(skip2("hello", 'l'));
    }
    static void skip(String s,String r,char check){
        if(s.isEmpty()){
            System.out.println(r);
            return;
        }
        if(s.charAt(0)==check){
            skip(s.substring(1), r, check);
        }
        else{
            skip(s.substring(1), r+s.charAt(0), check);
        }
    }
    static String skip2(String s,char check){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch==check){
            return skip2(s.substring(1), check);
        }
        else{
            return ch+skip2(s.substring(1), check);
        }
    }
}

