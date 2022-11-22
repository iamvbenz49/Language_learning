class printNRevAndStraight {
    public static void main(String[] args) {

        printrev(5);
    }
    static void printrev(int n){
        if(n==0){
            return;
        }
        else{
            System.out.print(n + " ");
            printrev(n-1);
        }
        System.out.print(n + " ");
    }
}
