package gg.rizkirafiif;

public class QueueClass {
    // deklarasi Node
    Node depan, belakang;

    // method isEmpty
    boolean isEmpty(){
        return (depan == null);
    }

    // method enqueue (untuk menambahkan data pada antrian)
    // mirip seperti addLast pada method single linked list
    void enqueue (Node input){
        if (isEmpty()){
            depan = input;
            belakang = input;
        } else {
            belakang.next = input;
            belakang = belakang.next;
        }
    }

    // method dequeue (untuk mengeluarkan data dari antrian)
    // mirip seperti removeFirst pada method single linked list
    void dequeue(){
        if (isEmpty())
            System.out.println("Dequeue gagal, antrian masih kosong!");
        else {
            Node temp = depan;
            System.out.println(temp.data + " berhasil dequeue!");
            if (depan == belakang){
                depan = belakang = null;
            } else {
                depan = depan.next;
            }
        }
    }

    // method show untuk menampilkan antrian saat ini
    void show(){
        if (!isEmpty()){
            Node temp = depan;
            System.out.print("Antrian saat ini : ");
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }

    // digunakan untuk mengosongkan data dalam antrian
    void makeEmpty(){
        // depan = belakang = null; sama saja dengan yang dibawah
        depan = null;
        belakang = null;
        System.out.println("Antrian berhasil dikosongkan!");
    }
}