public class Main{
    public static void main(String[] args){
        int salary = 100;
        if(salary>50){
            salary = salary + 100;
        } 
        else{
            salary = salary + 10;
        }
        System.out.println("The salary is "+salary);
    }
}