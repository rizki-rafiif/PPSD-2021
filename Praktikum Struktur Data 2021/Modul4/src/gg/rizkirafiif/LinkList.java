package gg.rizkirafiif;

public class LinkList implements List{
    // deklarasi node head & tail
    Node head;
    Node tail;

    // digunakan untuk cek apakah list kosong atau tidak
    public boolean isEmpty() {
        return head == null;
    }

    // digunakan untuk mencetak node
    public void printNode() {
        Node temp;
        temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // digunakan untuk meletakkan node di awal
    public void addFirst(Node input) {
        if (isEmpty()){
            head = input;
            tail = input;
        } else {
            input.next = head;
            head = input;
        }
    }

    // digunakan untuk meletakkan node di akhir
    public void addLast(Node input) {
        if (isEmpty()){
            head = input;
            tail = input;
        } else {
            tail.next = input;
            tail = input;
        }
    }

    // digunakan untuk menginputkan setelah suatu data
    public void insertAfter(int key, Node input) {
        Node temp = head;
        boolean found = false;
        do {
            if (temp.data == key){
                input.next = temp.next;
                temp.next = input;
                found = true;
                System.out.println("Memasukkan data "+input.data+
                        " setelah data " +key+ " sukses");
                break;
            }
            temp = temp.next;
        }
        while (temp != null);
        if (!found)
            System.out.println("Data "+key+" tidak ditemukan!");
    }

    // digunakan untuk menginputkan sebelum suatu data
    public void insertBefore(int key, Node input) {
        try {
            Node temp = head;
            while (temp != null){
                if (temp.data == key && temp == head){
                    this.addFirst(input);
                    System.out.println("Memasukkan data "+input.data+
                            " sebelum data "+key+" sukses!");
                    break;
                } else  if (temp.next.data == key){
                    input.next = temp.next;
                    temp.next = input;
                    System.out.println("Memasukkan data "+input.data+
                            " sebelum data"+key+" sukses!");
                    break;
                } temp = temp.next;
            }
        } catch (Exception e){
            System.out.println("Data "+key+" tidak ditemukan!");
        }
    }

    // digunakan untuk input berdasarkan index
    public void insert(int index, Node input) {
        Node temp = head;
        boolean found = false;
        int i = 0;
        while (temp != null){
            if (index == 0){
                this.addFirst(input);
                found = true;
                System.out.println("Data "+input.data+" berhasil " +
                        "dimasukkan pada index "+index);
                break;
            } else if (i == index-1){
                input.next = temp.next;
                temp.next = input;
                found = true;
                System.out.println("Data "+input.data+" berhasil " +
                        "dimasukkan pada index "+index);
                break;
            }else{
                temp = temp.next;
                i++;
            }
        }
        if (!found)
            System.out.println("Index "+index+" out of bound");
    }

    // digunakan untuk mengganti suatu data
    public void replace(int data1, int data2) {
        Node temp = head;
        boolean found = false;
        while (temp != null){
            if (temp.data == data1){
                temp.data = data2;
                found = true;
                System.out.println("Data "+data1+" berhasil diganti " +
                        "dengan data "+data2);
            } else {
                temp = temp.next;
            }
        }
        if (!found){
            System.out.println("Data "+data1+" tidak ditemukan!");
        }
    }

    // menghapus data
    public void remove(int data) {
        try {
            Node temp = head;
            while (temp != null){
                if (temp.next.data == data){
                    temp.next = temp.next.next;
                    System.out.println("Data " +data+ " berhasil dihapus");
                    break;
                } else if (temp.data == data && temp == head){
                    this.removeFirst();
                    System.out.println("Data "+data+" berhasil dihapus");
                    break;
                } temp = temp.next;
            }
        } catch (Exception e){
            System.out.println("Data "+data+" tidak ditemukan");
        }
    }

    // digunakan untuk menghapus data pertama
    public void removeFirst() {
        Node temp = head;
        if (!isEmpty()){
            if (head == tail){
                head = tail = null;
            } else {
                head = temp.next;
                temp.next = null;
                temp = null;
            }
        } else {
            System.out.println("List kosong");
        }
    }

    // digunakan untuk menghapus data terakhir
    public void removeLast() {
        Node temp = head;
        if (!isEmpty()){
            if (tail == head){
                head = tail = null;
            } else {
                while (temp.next != tail){
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                temp = null;
            }
        } else {
            System.out.println("List kosong!");
        }
    }

    // digunakan untuk mencari data
    public void find(int data) {
        int i = 0;
        boolean found = false;
        Node temp = head;
        while (temp != null){
            if (temp.data == data){
                found = true;
                System.out.println(data+" ditemukan pada index ke"+i);
            }
            i++;
            temp = temp.next;
        }
        if (!found){
            System.out.println("Data tidak ditemukan");
        }
    }

    // digunakan untuk mencari panjang list
    public int length() {
        Node temp = head;
        int i = 0;
        if (isEmpty())
            System.out.println("data kosong!");
        else{
            while (temp != null){
                temp = temp.next;
                i++;
            }
        }
        System.out.println("Panjang data : "+i);
        return i;
    }

    // tugas !
    public void removeAt() {

    }

    public void clear() {

    }
}
