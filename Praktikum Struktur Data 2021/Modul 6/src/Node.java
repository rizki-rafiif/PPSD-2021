import java.util.Scanner;

public class Node {
    //    Deklarasi atribut
    Object data; // data yang ada di dalam stack
    Node next; // variable yang berfungsi untuk pointer next
    Node tos; // variable yang berfungsi untuk topOfStack (elemen yang ada di tumpukan paling atas

    //    Constructor 1 parameter
    public Node(Object data) {
        this.data = data;
    }

    //    Constructor tanpa parameter
    public Node() { }

    //    mengecek stack
    public boolean isEmpty(){
        return (tos==null);
    }

    //    menambahkan elemen
    void push(Node input){
        if(isEmpty()){ //stack kosong
            tos = input; //nilai tos menjadi nilai input
        } else { //stack isi terjadi pergeseran data
            input.next = tos; // pointer next diisi nilai tos
            tos = input; // posisi tos diisikan dengan nilai yang diinputkan
            System.out.println("Data berhasil ditambahkan");
        }
    }

    //    mengambil data pada urutan terakhir
    void pop(){
        if(!isEmpty()){ //jika stack tidak kosong
            Node temp = tos; // temp untuk menyimpan nilai tos
            tos = tos.next;
            temp.next = null;
            System.out.println("Yang di POP : "+temp.data.toString());
        } else {
            System.out.println("Tidak bisa karena stack kosong!");
        }
    }

    //    menampilkan isi stack
    void show(){
        if(!isEmpty()){ // jika stack tidak kosong
            Node temp = tos;
            while (temp!=null){
                System.out.println(temp.data.toString()+"\n");
                temp = temp.next;
            }
        } else {
            System.out.println("Stack kosong!");
        }
    }

    //    method untuk mengecek nilai top
    void top(){
        Node temp = tos;
        System.out.println("TOP sekarang : "+temp.data);
    }

    //    method untuk mengecek nilai top dan pop
    void topAndPop(){
        this.top(); // memanggil method top
        this.pop(); // memanggil method pop
    }

    //    method untuk mengosongkan stack
    void makeEmpty(){
        tos = null;
        System.out.println("Data berhasil dihapus semua !");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bil;
        Node obj1 = new Node();
        boolean exit = false;
        do {
            System.out.println("Menu Stack");
            System.out.println("1. Push data");
            System.out.println("2. POP data");
            System.out.println("3. Show data");
            System.out.println("4. Clear data");
            System.out.println("5. Data TOP");
            System.out.println("6. Data POP");
            System.out.print("Masukkan pilihan : ");
            int pil = scanner.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("Masukkan bilangan : ");
                    bil = scanner.nextInt();
                    Node obj2 = new Node(bil);
                    obj1.push(obj2);
                    System.out.println();
                    break;
                case 2:
                    obj1.pop();
                    System.out.println();
                    break;
                case 3:
                    obj1.show();
                    System.out.println();
                    break;
                case 4:
                    obj1.makeEmpty();
                    System.out.println();
                    break;
                case 5:
                    obj1.top();
                    System.out.println();
                    break;
                case 6:
                    obj1.topAndPop();
                    System.out.println();
                    break;
                default:
                    System.out.println("Tidak ada dalam pilihan ");
                    exit = true;
            }
        } while (exit == false);
    }
}
