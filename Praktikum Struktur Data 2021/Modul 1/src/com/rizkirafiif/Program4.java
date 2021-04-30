package com.rizkirafiif;
// program menghitung luas lingkaran
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        // buat objek dari library scanner
        Scanner input = new Scanner(System.in);
        // deklarasikan variabel
        double luas, pi = 3.14;
        int jari;

        // input jari-jari
        System.out.print("Inputkan jari-jari\t: ");
        jari = input.nextInt();
        // perhitungan luas lingkaran
        luas = pi * jari * jari;
        System.out.println("Luas lingkaran\t= " + luas);
    }
}
