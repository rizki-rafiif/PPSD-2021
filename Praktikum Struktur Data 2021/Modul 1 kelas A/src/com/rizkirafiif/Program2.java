package com.rizkirafiif;
// membuat program full piramid
public class Program2 {
    public static void main(String[] args) {
        // deklarasi variabel
        int i, j, k;
        // outer loop
        for (i = 1; i <= 5; i++){
            // inner loop 1
            for (j = 5; j > i; j--){
                System.out.print(" ");
            }
            // inner loop 2
            for (k = 1; k < (2*i); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
