package com.abhysunny.patterns;

import java.util.*;


public class PatternA{

    public static void main (String []Args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=1, c=n;

        while(i<=n){
           int j= 1;
           c--;
           char p = (char)('A' + c);
            while(j<=i){
                System.out.print(p);
                p = (char)(p + 1);
                j++;
             }
            System.out.println();
            i++;

        }


    }
}
