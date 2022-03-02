package com.abhysunny.arrays;

public class PairArray {


    public static void printAllPairs(int [] arr){

        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
             System.out.println("("+ arr[i]+","+ arr[j] + ")");
            }
        }
    }

    public static void main(String Args[]){
        int [] arr = {1,2,5,7,4,3};
        printAllPairs(arr);
    }

}
