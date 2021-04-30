package com.rizkirafiif;

public class Program4 {
    public static int maxSubSUm(int [] a){
        int maxSum = 0, thisSum = 0;
        for (int i = 0; i < a.length; i++) {
            thisSum += a[i];
            System.out.println("thisSum sekarang : " +thisSum);
            if (thisSum > maxSum){
                maxSum = thisSum;
                System.out.println("maxSum sekarang : " +maxSum);
            }
            else if(thisSum < 0){
                thisSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a [] = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum;
        maxSum = maxSubSUm(a);
        System.out.println("Max sum adalah \t: "+ maxSum);
    }
}
