package com.rizkirafiif;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        // membuat objek library scanner
        Scanner input = new Scanner(System.in);
        // deklarasi variabel
        double luas, pi = 3.14;
        int jari;
        // input jari-jari
        System.out.print("Inputkan jari-jari\t: ");
        jari = input.nextInt();
        // perhitungan luas
        luas = pi * jari * jari;
        // output
        System.out.println("Luas Lingkaran\t: " +luas);
    }
}
