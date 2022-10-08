package excercise;

public class largestNum {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;
        if(i>j && i>k){
            System.out.println("I is greater");
        }
        else if(j>i && j>k){
            System.out.println("J is greater");
        }
        else{
            System.out.println("K is greater");
        }

        int maximum = Math.max(Math.max(i,j),k);
        System.out.println(maximum);
    }
}
