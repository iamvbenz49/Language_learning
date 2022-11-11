package stringsAndStringBuilders;

public class SBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for(int i =0 ;i<26;i++){
            char k = (char)('a'+i);
            s.append(k);
        }
        System.out.println(s);
    }
}
