package com.rizkirafiif;

public class Program2 {
    public static int maxSubSum(int [] a){
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            // untuk thisSum dideklarasikan di outer loop
            System.out.println("Outer loop");
            int thisSum = 0;
            for (int j = i; j < a.length; j++) {
                System.out.println("Inner loop");
                // proses di tambahkan secara berurutan
                thisSum += a[j];
                System.out.println("This sum saat ini\t: " +thisSum);
                if (thisSum > maxSum){
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a [] = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum;
        maxSum = maxSubSum(a);
        System.out.println("Max sum adalah \t: "+ maxSum);
    }
}
