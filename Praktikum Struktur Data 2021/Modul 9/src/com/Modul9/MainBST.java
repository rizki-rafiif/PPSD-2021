package com.Modul9;

import java.util.Scanner;

public class MainBST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner s = new Scanner(System.in);

        // contoh memanggil isEmpty
        if (bst.isEmpty())
            System.out.println("Data masih kosong!");
        else {
            System.out.println("Data tidak kosong!");
        }

        // contoh  menggunkana insert
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan data : ");
            int data = s.nextInt();
            bst.insert(new Node(data));
        }
        System.out.println();

        // contoh find Directory
        System.out.print("Cari data secara direktori : ");
        int data1 = s.nextInt();
        bst.findDirectory(data1);

        // contoh remove
        System.out.print("remove data : ");
        int remo = s.nextInt();
        bst.remove(remo);

        if (bst.isEmpty())
            System.out.println("Data masih kosong!");
        else {
            System.out.println("Data tidak kosong!");
        }

        System.out.println("Nilai maximum : "+bst.findMax().data);
        System.out.println("Nilai minimum : " + bst.findMin().data);

        // contoh penggunaan find
        System.out.print("Cari data : ");
        int cari = s.nextInt();
        bst.find(cari);

        // contoh hasil getLeafCount
        System.out.println("Jumlah leaf : " + bst.getLeafCount());
    }
}
