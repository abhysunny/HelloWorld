package com.abhysunny.operators;

import java.util.Scanner;

public class NumReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int rev_num = 0;
        while(num > 0)
        {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev_num);

       }

 }




