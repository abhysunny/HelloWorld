package com.abhysunny.patterns;

import java.util.*;

public class Patterns2 {

    public static void main(String[]Args){

        Scanner sc = new Scanner(System.in);
        int iPattern = sc.nextInt();
        int i=1;


        while(i<=iPattern){

            int j =1;
            while(j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }



    }
}
