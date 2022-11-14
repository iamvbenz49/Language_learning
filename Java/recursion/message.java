package com.recursion;

public class message{
    public static void main(String[] args) {
        mesSage(0);
    }
    static void mesSage(int n){
        if(n ==5){
            return;
        }
        System.out.println(n);
        mesSage(n+1);
    }
}