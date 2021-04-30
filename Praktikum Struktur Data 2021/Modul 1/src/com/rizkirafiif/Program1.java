package com.rizkirafiif;
// program cetak bintang versi 1
// setengah piramid
public class Program1 {
    public static void main(String[] args) {
        // outer loop berualng sebanyak 5 kali
        for (int i = 1; i <= 5; i++) {
            // inner loop mengulang sebanyak kurang dari
            // sama dengan i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
