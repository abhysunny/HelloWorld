package com.abhysunny.patterns;

import java.util.Scanner;

public class Patterns8 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1= (n+1)/2;
        int n2 = n/2;

        int i = 1;
        while (i <= n1) {

            int space = 1;
            while (space <= n1 - i) {
                System.out.print(" ");
                space++;
            }

            int num = 1;
            while (num <= 2*i -1) {
                System.out.print("*");
                num++;
            }

            System.out.println();
            i++;
        }

        int j = n2;
        while(j>=1)
        {
            int space = 1;
            while (space <= n2 - j +1) {
                System.out.print(" ");
                space++;
            }

            int num = 1;
            while (num <= 2*j -1) {
                System.out.print("*");
                num++;
            }
            System.out.println();
            j--;
        }

    }
}









