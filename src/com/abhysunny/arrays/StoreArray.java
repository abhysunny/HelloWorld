package com.abhysunny.arrays;

import java.util.Scanner;

public class StoreArray {


    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] numArray = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter "+ i + "th element");
            numArray[i] = s.nextInt();
        }
        return numArray;
    }

    public static void printArray(int[] numArray){
        int n = numArray.length;
        for(int i=0;i<n;i++){
            System.out.println(numArray[i]);
        }

    }

    public static void main(String[] Args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] numArray = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter "+ i + "th element");
            numArray[i] = s.nextInt();
        }




    }

}
