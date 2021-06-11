package gg.rizkirafiif;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        QueueClass q = new QueueClass();

        // memanggil method isEmpty
        if (q.isEmpty())
            System.out.println("Antrian belum memiliki data!");

        // menginputkan datanya
        for (int i = 0; i < 5; i++) {
            System.out.print("Inputkan data : ");
            int input = s.nextInt();
            Node data = new Node(input);
            q.enqueue(data);
        }

        // untuk menampilkan data
        q.show();

        // mengeluarkan data
        q.dequeue();

        System.out.println();
        q.show();

        // mengosongkan data
        q.makeEmpty();

        // mengecek apakah antrian kosong
        if (q.isEmpty())
            System.out.println("Antrian belum memiliki data!");
    }
}
