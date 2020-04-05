package javaapplication;

import java.util.Scanner;
public class JavaApplication {

    public static void main(String[] args) {
        int a=Fibanachi(5,2);
        System.out.println(a);
    }
    public static int Fibanachi(int k,int n){
        if(k!=0){
            k--;
            n=n-1+n-2;
            return Fibanachi(k,n);
        }
        else return n;
    }
}
