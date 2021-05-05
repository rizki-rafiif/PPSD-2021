package com.rizkirafiif;

import java.util.Scanner;

public class DoubleListMain {
    public static void main(String[] args) {
        // deklarasi objek kelas DoublyLinkList dan Scanner
        DoublyLinkList list = new DoublyLinkList();
        Scanner scan = new Scanner(System.in);

        System.out.println("Contoh addFirst");
        for (int i = 0; i < 3; i++) {
            System.out.print("Inputkan data : ");
            int input = scan.nextInt();
            Node obj = new Node(input);
            list.addFirst(obj);
        }list.show();

        System.out.println("\nContoh addLast");
        for (int i = 0; i < 3; i++) {
            System.out.print("Inputkan data : ");
            int input = scan.nextInt();
            Node obj = new Node(input);
            list.addLast(obj);
        }list.show();


        System.out.println("\nContoh removeFirst");
        list.removeFirst();
        list.show();
        System.out.println("\nContoh removeLast");
        list.removeLast();
        list.show();


        System.out.println("\nContoh menggunakan insert");
        for (int i = 0; i < 2; i++) {
            System.out.print("Inputkan lokasi index : ");
            int index = scan.nextInt();
            System.out.print("Inputkan datanya : ");
            int input = scan.nextInt();
            Node obj = new Node(input);
            list.insert(index, obj);
        }list.show();

        System.out.println("\nContoh replace");
        for (int i = 0; i < 1; i++) {
            System.out.print("Inputkan data yang ingin diganti: ");
            int data1 = scan.nextInt();
            System.out.print("Inputkan data baru : ");
            int data2 = scan.nextInt();
            Node obj1 = new Node(data1);
            Node obj2 = new Node(data2);
            list.replace(obj1, obj2);
        }list.show();

        System.out.println("\nContoh remove");
        System.out.print("Inputkan data yang ingin dihapus : ");
        int remove = scan.nextInt();
        Node objRemove = new Node(remove);
        list.remove(objRemove);
        list.show();

        System.out.println("\nContoh removeAt");
        System.out.print("Inputkan index data yang ingin dihapus : ");
        int removeIndex = scan.nextInt();
        list.removeAt(removeIndex);
        list.show();

        System.out.println("\nHasil showReversed");
        list.showReversed();

        System.out.println("\ncontoh find");
        System.out.print("Cari data : ");
        int cari = scan.nextInt();
        Node objCari = new Node(cari);
        list.find(objCari);

        // memberi output panjang list
        System.out.println();
        list.length();

        // menghapus list
        System.out.println();
        list.clear();

        // mengecek apakah list kosong atau tidak setelah dihapus
        if (list.isEmpty())
            System.out.println("\nList sudah kosong!");
    }
}
