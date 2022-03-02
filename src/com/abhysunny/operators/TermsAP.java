package com.abhysunny.operators;

import java.util.Scanner;

public class TermsAP {
             public static void main (String[] args) {

                 Scanner sc = new Scanner(System.in);
                 int n = sc.nextInt();
                 int valueCount =0;
                 for(int i =1; valueCount<n; i++){

                 int value = 3*i + 2;
                 if(value%4 != 0){
                     System.out.print(value+ " ");
                     valueCount++;
                 }

                 }



             }
}



