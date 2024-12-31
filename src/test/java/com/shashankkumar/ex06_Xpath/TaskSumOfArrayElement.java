package com.shashankkumar.ex06_Xpath;

public class TaskSumOfArrayElement {
   public static void main(String[] args){
       int arr[] = {43,65,89,12,34,56,90,1};

       int sum =0;
       for(int i=0; i<arr.length; i++){
           sum =sum+arr[i];
       }
       System.out.println("Sum of Array of Elements is "+sum);
   }

}
