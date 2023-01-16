package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class backtrackingMaze {
    public static void main(String[] args) {
        boolean[][] arr = {
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
        int[][] matrix = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };
        System.out.println(paths("",0,0,arr));
        matrixpaths("", 0, 0, arr, matrix, 1);
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
        maze[m][n]=false;
        if(m<maze.length-1){
            list.addAll(paths(s+'D',m+1,n,maze));
            // return list;
        }
        if(n<maze[0].length-1){
            list.addAll(paths(s+'R',m,n+1,maze));
            // return list;
        }
        if(n>0){
            list.addAll(paths(s+'L',m,n-1,maze));
        }
        if(m>0){
            list.addAll(paths(s+'U',m-1,n,maze));
        }
        maze[m][n]=true;
        return list;
    }
    static void matrixpaths(String s,int m,int n,boolean[][] maze,int[][] matrix,int i){
        if(m==maze.length-1 && n==maze[0].length-1){
            matrix[m][n] = i;
            for(int k=0;k<matrix.length;k++){
                System.out.println(Arrays.toString(matrix[k]));
            }
            System.out.print(s);
            System.out.println();
            matrix[m][n] = 0;
            return;
        }
        if(!maze[m][n]){
            return;
        }
        maze[m][n]=false;
        matrix[m][n] = i;
        if(m<maze.length-1){
            matrixpaths(s+'D',m+1,n,maze,matrix,i+1);
        }
        if(n<maze[0].length-1){
            matrixpaths(s+'R',m,n+1,maze,matrix,i+1);
        }
        if(n>0){
            matrixpaths(s+'L',m,n-1,maze,matrix,i+1);
        }
        if(m>0){
            matrixpaths(s+'U',m-1,n,maze,matrix,i+1);
        }
        maze[m][n]=true;
        matrix[m][n] = 0;
    }
}
