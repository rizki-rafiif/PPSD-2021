package com.rizkirafiif;

public class DoublyLinkList implements List{
    // deklarasi obj untuk node head dan tail
    Node head, tail;

    // digunakan untuk mengecek apakah list kosong
    public boolean isEmpty() {
        return head == null;
    }

    // selalu menambahkan pada awal list
    public void addFirst(Node input) {
        if (isEmpty()){
            head = input;
            tail = input;
        } else {
            // head.kiri agar head punya pointer ke arah input
            head.kiri = input;
            // input.kanan agar input punya pointer ke arah head
            input.kanan = head;
            head = input;
        }
    }

    // selalu menambahkan pada akhir list
    public void addLast(Node input) {
        if (isEmpty()){
            head = tail;
            tail = head;
        } else {
            tail.kanan = input;
            input.kiri = tail;
            tail = input;
        }
    }

    // digunakan menampilkan didalam list dimulai dari head
    public void show() {
        Node temp = head;
        if (isEmpty()){
            System.out.println("Data masih kosong!");
        } else {
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.kanan;
            }
        }
        System.out.println();
    }

    // digunakan untuk selalu menghapus node di awal list
    public void removeFirst() {
        Node temp = head;
        if (isEmpty())
            System.out.println("List masih kosong");
        else {
            if (head == tail)
                head = tail = null;
            else {
                head = temp.kanan;
                head.kiri = null;
                temp.kanan = null;
                temp = null;
            }
        }
    }

    // digunakan untuk selalu menghapus node di akhir list
    public void removeLast() {
        Node temp = tail;
        if (isEmpty())
            System.out.println("List masih kosong");
        else {
            if (tail == head)
                head = tail = null;
            else {
                tail = tail.kiri;
                tail.kanan = null;
                temp.kiri = null;
                temp = null;
            }
        }
    }

    // digunakan untuk menginputkan elemen sesuai index
    public void insert(int index, Node input) {
        Node temp = head;
        boolean found = false;
        int i = 0;
        while (temp != null){
            if (index == 0){
                this.addFirst(input);
                found = true;
                System.out.println("Data "+input.data+" berhasil dimasukkan pada index" +
                        " ke-"+index);
                break;
            } else if (i == index-1 && temp != tail){
                input.kanan = temp.kanan;
                temp.kanan.kiri = input;
                input.kiri = temp;
                temp.kanan = input;
                found = true;
                System.out.println("Data "+input.data+" berhasil dimasukkan pada index " +
                        "ke-"+index);
                break;
            } else if (i == index-1 && temp == tail){
                this.addLast(input);
                found = true;
                System.out.println("Data "+input.data+" berhasil dimasukkan pada index " +
                        "ke-"+index);
                break;
            } temp = temp.kanan; i++;
        }
        if (!found)
            System.out.println("index "+index+" out of bound!");
    }

    // digunakan untuk mengganti data dalam list
    public void replace(Node data1, Node data2) {
        Node temp = head;
        boolean found = false;
        while (temp != null){
            if (temp.data == data1.data){
                temp.data = data2.data;
                found = true;
                System.out.println("Data "+data1.data+" berhasil diganti dengan data "+
                        data2.data);
                break;
            } temp = temp.kanan;
        }
        if (!found)
            System.out.println("Data tidak ditemukan!");
    }

    // digunakan untuk menghapus data berdasarkan data node-nya
    public void remove(Node data) {
        try{
            Node temp = head;
            while (temp != null){
                if (temp.data == data.data && temp == tail){
                    this.removeLast();
                    System.out.println("Data "+data.data+" berhasil dihapus!");
                    break;
                } else if (temp.data == data.data && temp == head){
                    this.removeFirst();
                    System.out.println("Data "+data.data+" berhasil dihapus!");
                    break;
                } else if (temp.kanan.data == data.data && temp.kanan != tail){
                    temp.kanan = temp.kanan.kanan;
                    temp.kanan.kiri = temp;
                    System.out.println("Data "+data.data+" berhasil dihapus!");
                    break;
                } temp = temp.kanan;
            }
        } catch (Exception e){
            System.out.println("Data "+data.data+" tidak ditemukan!");
        }
    }

    // digunakan untuk menghapus berdasarkan urutan index
    public void removeAt(int index) {
        Node temp = head;
        int i = 0 ;
        try {
            while (temp != null){
                if (index == 0){
                    this.removeFirst();
                    System.out.println("Data awal berhasil dihapus");
                    break;
                } else if (i == index-1 && temp.kanan != tail){
                    temp.kanan = temp.kanan.kanan;
                    temp.kanan.kiri = temp;
                    System.out.println("Data pada index "+index+" berhasil dihapus!");
                    break;
                } else if (i == index-1 && temp.kanan == tail){
                    this.removeLast();
                    System.out.println("Data terakhir berhasil dihapus");
                    break;
                }temp = temp.kanan; i++;
            }
        } catch (Exception e){
            System.out.println("Index "+index+" out of bound");
        }
    }

    // menampilkan data pada list secara terbalik (dari akhir/tail)
    public void showReversed() {
        Node temp = tail;
        if (isEmpty())
            System.out.println("List masih kosong!");
        else {
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.kiri;
            }
            System.out.println();
        }
    }

    // digunakan untuk mencari data berdasarkan data node-nya
    public void find(Node data) {
        int i = 0;
        boolean found = false;
        Node temp = head;
        while (temp!=null){
            if (temp.data == data.data){
                found = true;
                break;
            } i++; temp = temp.kanan;
        }
        if (found) {
            System.out.println(data.data + " ditemukan pada index ke-" + i);
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }

    // menghitung panjang list dengan bantuan variabel i
    public int length() {
        Node temp = head;
        int i = 0;
        if (isEmpty())
            System.out.println("List masih kosong!");
        else{
            while (temp != null) {
                temp = temp.kanan;
                i++;
            }
        }
        System.out.println("Panjang data : "+i);
        return i;
    }

    // menghapus list
    public void clear() {
        if (isEmpty())
            System.out.println("List masih kosong!");
        else {
            // disini menjadikan head dan tail = null
            head = null;
            tail = null;
            System.out.println("Data berhasil dihapus semua!");
        }
    }

    public void insertAfter(Node key, Node input) {

    }

    public void insertBefore(Node key, Node input) {

    }
}
