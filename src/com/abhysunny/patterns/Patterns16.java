package com.abhysunny.patterns;

import java.util.Scanner;

public class Patterns16 {

            public static void printPattern(int n, String symbol){
                //System.out.println(n + symbol);

                for(int i=1; i<=n; i++){

                    for(int j=n-1; j>=i; j--){
                        System.out.print(" ");
                    }
                    for(int j=1; j<=i; j++){
                        System.out.print(symbol);
                    }

                    System.out.println();
                }


            }



            public static void main (String Args[]){
                System.out.println("Hello! Please enter your name");

                Scanner s = new Scanner(System.in);
                String name = s.next();

                System.out.println("Hello " + name + ". I hope you are doing good.");
                System.out.println("Please enter the symbol to be printed for pyramid pattern and the no: of rows");

                String symbol = s.next();
                int n =s.nextInt();

                System.out.println("Printing a pyramid with symbol: " + symbol);
                printPattern(n,symbol);


            }

            }







