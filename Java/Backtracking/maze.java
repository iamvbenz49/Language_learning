package Backtracking;
import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        System.out.println(mazeNumberOfPaths(3, 3));
        System.out.println(paths("", 3, 3));
        System.out.println(mazeNumberOfPathsDiagonal(3, 3));
        System.out.println(pathDiagonal ("", 3, 3));
    }
    static int mazeNumberOfPaths(int m,int n){
        if(m==1 || n==1){
            return 1;
        }
        return mazeNumberOfPaths(m-1,n)+mazeNumberOfPaths(m,n-1);
    }
    static ArrayList<String>  paths(String s,int m,int n){
        ArrayList<String> list = new ArrayList<>();
        if(m==1 && n==1){
            list.add(s);
            return list;
        }
        if(m!=1){
            list.addAll(paths(s+'D',m-1,n));
            // return list;
        }
        if(n!=1){
            list.addAll(paths(s+'R',m,n-1));
            // return list;
        }
        // list.addAll(paths(s+'D',m-1,n));
        // list.addAll(paths(s+'R',m,n-1));
        return list;
    }
    static int mazeNumberOfPathsDiagonal(int m,int n){
        if(m==1 || n==1){
            return 1;
        }
        return mazeNumberOfPathsDiagonal(m-1,n)+mazeNumberOfPathsDiagonal(m,n-1)+mazeNumberOfPathsDiagonal(m-1,n-1);
    }
    static ArrayList<String>  pathDiagonal(String s,int m,int n){
        ArrayList<String> list = new ArrayList<>();
        if(m==1 && n==1){
            list.add(s);
            return list;
        }
        if(m!=1){
            list.addAll(pathDiagonal(s+'V',m-1,n));
            // return list;
        }
        if(n!=1){
            list.addAll(pathDiagonal(s+'H',m,n-1));
            // return list;
        }
        if(m!=1 && n!=1){
            list.addAll(pathDiagonal(s+'D',m-1,n-1));
            // return list;
        }
        // list.addAll(paths(s+'D',m-1,n));
        // list.addAll(paths(s+'R',m,n-1));
        return list;
    }
}
