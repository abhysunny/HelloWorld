package com.abhysunny.patterns;

import java.util.Scanner;

public class Pattern11 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int currRow = 1;
        int sum = 0;

        while(currRow <= n){

            sum+= currRow;
            int curCol = 1;
            while(curCol<=currRow) {
                System.out.print(curCol);
                if (curCol == currRow) {
                    System.out.print("=");
                } else {
                    System.out.print("+");
                }
                curCol += 1;
            }
            System.out.println(sum);
            currRow+=1;
        }
    }
}








