package com.rizkirafiif;
// membuat setengah piramid
public class Program1 {
    public static void main(String[] args) {
        // outer loop
        for (int i = 1; i <= 5; i++) {
            // inner loop
            // cetak bintang sebanyak j kurang dari sama dengan i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
