package com.rizkirafiif;

public class Program1 {
    public static int maxSubSUm(int [] a){
        int maxSum = 0; // untuk menampung nilai maximal
        for (int i = 0; i < a.length; i++) {
            System.out.println("Outer loop");
            for (int j = i; j < a.length; j++) {
                System.out.println("Inner loop 1");
                // variabel untuk menampung nilai sementara
                int thisSum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.println("Inner loop 2");
                    thisSum += a[k]; // sama dengan thisSum = thisSum + a[k]
                    System.out.println("Setelah ditambahkan \t:" +thisSum);
                }
                // masuk if jika nilai thisSum > maxSum
                if (thisSum > maxSum){
                    maxSum = thisSum;
                    System.out.println("Max sum\t: " +maxSum);
                }
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
