package com.shashankkumar.ex06_Xpath;

import java.util.Arrays;

public class TaskFindSecondLargestElementInArray {
    public static void main(String[] args){
        int arr[] = {78,23,65,24,0,543,90,333,9,1,10};

        for(int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }

        System.out.println(arr[arr.length-2]);
            // or we can use Arrays utility class
    /*    Arrays.sort(arr);
        System.out.println(arr[arr.length-2]); */
    }
}
