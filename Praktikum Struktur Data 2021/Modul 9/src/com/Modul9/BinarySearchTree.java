package com.Modul9;

public class BinarySearchTree {
    Node root;

    // membuat method isEmpty
    boolean isEmpty(){
        return root == null;
    }

    void insert(Node input){
        Node temp = root;
        Node parent = null;
        boolean flag = false;
        if (isEmpty()){
            root = input;
        } else {
            while (temp != null){
                parent = temp;
                if (input.data < temp.data){
                    temp = temp.left;
                    flag = true;
                } else if (input.data > temp.data){
                    temp = temp.right;
                    flag = true;
                } else {
                    System.out.println("Data tidak boleh ada duplikasi data!");
                    break;
                }
            }
            if (flag){
                if (input.data > parent.data){
                    parent.right = input;
                } else if (input.data < parent.data){
                    parent.left = input;
                } else {
                    System.out.println("Data tidak boleh ada duplikasi!");
                }
            }
        }
    }

    // method find
    void find (int cari){
        Node temp = root;
        boolean cek = false;
        while (temp != null){
            // masuk kebagian kiri kalau data yang dicari
            // kurang dari root / parent
            if (cari < temp.data){
                temp = temp.left;
            }
            // masuk kebagian kanan kalau data yang dicari
            // lebih besar dari root/parent
            else if (cari > temp.data){
                temp = temp.right;
            }
            // kalau sudah sampai ke data yang dicari
            // ganti cek ke true untuk menandakan data ada dalam tree
            else if (cari == temp.data){
                cek = true;
                break;
            }
        }
        if (cek)
            System.out.println("Data "+cari+" ditemukan!");
        else {
            System.out.println("Data tidak ketemu!");
        }
    }

    // method findmax
    Node findMax(){
        Node temp = root;
        if (isEmpty())
            return null;
        else {
            while (temp.right != null){
                temp = temp.right;
            }
            return temp;
        }
    }

    // method findMin
    Node findMin(){
        Node temp = root;
        if (isEmpty())
            return null;
        else {
            while (temp.left != null)
                temp = temp.left;
            return temp;
        }
    }

    // method remove yang dipanggil di main
    public void remove(int input) {
        root = remove(input, root);
    }

    // method remove yang kedua (double parameter)
    // remove yang ini beda dengan modul
    private Node remove(int input, Node temp) {
        if (temp == null) {
            return null;
        }

        if (input == temp.data) {
            if (temp.left == null && temp.right == null) {
                return null;
            }

            if (temp.left == null) {
                return temp.right;
            }

            if (temp.right == null) {
                return temp.left;
            }

            temp.data = temp.right.data;
            temp.right = remove(temp.data, temp.right);
        } else if (input < temp.data) {
            temp.left = remove(input, temp.left);
        } else {
            temp.right = remove(input, temp.right);
        }

        return temp;
    }

    // method lanjutan checking
    private boolean checking(int input){
        Node temp = root;
        while (temp != null){
            // if pertama dan kedua untuk mengecek arah dan gerk
            // data yang dilewati
            if (input < temp.data){
                temp = temp.left;
            } else if (input > temp.data){
                temp = temp.right;
            }
            // disini kalau misal sudah ketemu datanya akan
            // return true
            else if (input == temp.data){
                return true;
            }
        }
        return false;
    }


    // removeAll
    void removeAll(){
        if (isEmpty())
            System.out.println("Tree masih kosong!");
        else {
            root = null;
            System.out.println("Data berhasil dihapus semua");
        }
    }


    // find directory
    void findDirectory(int input){
        if (isEmpty())
            System.out.println("Tree masih kosong!");
        else {
            if (this.checking(input) == true){
                Node temp = root;
                while (temp != null){
                    if (input > temp.data){
                        System.out.print(temp.data + " , ");
                        temp = temp.right;
                    } else if (input < temp.data){
                        System.out.print(temp.data + " , ");
                        temp = temp.left;
                    }
                    else if (input == temp.data){
                        System.out.println(input);
                        break;
                    }
                }
            } else {
                System.out.println("data tidak ditemukan dalam tree!");
            }
        }
    }

    // method untuk menghitung leaf
    public int getLeafCount(){
        return this.getLeafCountHelper(root);
    }

    // method getLeafCountHelper berisi proses untuk menghitung leaf
    private int getLeafCountHelper(Node data){
        if (data == null){
            return 0;
        } else if (data.left == null && data.right == null){
            return 1;
        } else {
            return this.getLeafCountHelper(data.left) +
                    this.getLeafCountHelper(data.right);
        }
    }
}


