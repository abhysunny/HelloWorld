package com.abhysunny.patterns;

import java.util.Scanner;

public class Patterns10 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        while (row <= n) {

            int space = 1;
            while (space < row ) {
                System.out.print(" ");
                space++;
            }
            System.out.print("*");
            int col = 1;
            while (col < n) {
                System.out.print("*");
                col++;
            }

            System.out.println();
            row++;
        }
    }
}











