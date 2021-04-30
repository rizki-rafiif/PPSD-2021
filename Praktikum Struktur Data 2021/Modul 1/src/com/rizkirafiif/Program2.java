package com.rizkirafiif;
// program bintang versi 2
// cetak piramid penuh
public class Program2 {
    public static void main(String[] args) {
        // deklarasi variabel
        int i, j, k;
        // outer loop
        for (i = 1; i <= 5; i++){
            // inner loop 1
            // untuk mencetak space
            for (j = 5; j > i; j--){
                System.out.print(" ");
            }
            // inner loop 2
            // untuk mencetak bintang
            for (k = 1; k < (2 * i); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
