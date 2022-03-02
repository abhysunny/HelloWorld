package com.abhysunny.patterns;

import java.util.Scanner;

public class Square {


    public static void squarePattern(int n){

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void main(String Args[]){

       System.out.println("Enter the no: of rows");

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       squarePattern(n);
    }

}
