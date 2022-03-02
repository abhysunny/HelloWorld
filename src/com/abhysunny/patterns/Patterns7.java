package com.abhysunny.patterns;

import java.util.Scanner;

public class Patterns7 {

            public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int i = 1;
            while(i<=n){

                int space = 1;
                while(space <= n-i){
                    System.out.print(" ");
                    space++;
                }

                int num = 1;
                while(num<=i){
                    System.out.print(num+i-1);
                    num++;
                }

                int dec = i-1;
                while(dec>=1){
                    System.out.print(dec+i-1);
                    dec--;
                }


                System.out.println();
                i++;
                }
            }

            }







