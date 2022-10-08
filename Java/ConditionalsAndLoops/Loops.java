public class Loops {
    public static void main(String[] args) {
        for(int num = 1;num<=5;num++){
            System.out.println(num);
        }
        String s = "Hello dude";
        int i = 0;
        while(i<10){
            System.out.println(s+i);
            i++;
        }
        /*
            do{

            }
            while(condition)
         */
        do{
            System.out.println("I am groot");
        }
        while(false);
    }
}
