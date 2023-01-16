package Backtracking;
import java.util.ArrayList;

public class mazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] arr = {
            {true,true,true},
            {true,false,true},
            {true,true,true},
        };
        System.out.println(paths("",0,0,arr));
    }
    static ArrayList<String>  paths(String s,int m,int n,boolean[][] maze){
        ArrayList<String> list = new ArrayList<>();
        if(m==maze.length-1 && n==maze[0].length-1){
            list.add(s);
            return list;
        }
        if(!maze[m][n]){
            return list;
        }
        if(m<maze.length-1){
            list.addAll(paths(s+'D',m+1,n,maze));
            // return list;
        }
        if(n<maze[0].length-1){
            list.addAll(paths(s+'R',m,n+1,maze));
            // return list;
        }
        // list.addAll(paths(s+'D',m-1,n));
        // list.addAll(paths(s+'R',m,n-1));
        return list;
    }
}
