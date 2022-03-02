package com.abhysunny.arrays;

public class DuplicateArray {


    public static int duplicateNumber(int arr[]) {

        int n = arr.length;
        int x = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-2;j++){
                if(arr[i]==arr[j]){
                    x=(arr[i]);
                }
            }

        }
        return x;
    }

    public static void main(String Args[]){
        int [] arr = {0,2,2,3,1};
        int duplicateValue = duplicateNumber(arr);
        System.out.println(duplicateValue);
    }

}
