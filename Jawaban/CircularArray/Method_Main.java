package gg.rizkirafiif.Jawaban.CircularArray;
import java.util.Scanner;
public class Method_Main {
    void printPilihan(){
        System.out.print("Pilihan Anda :\n"
                + "1.  Memasukkan data (enqueue)\n"
                + "2.  Mengambil data(dequeue)\n"
                + "3.  Hapus semua (makeEmpty)\n"
                + "4.  Isi queue (show)\n"
                + "5.  Keluar\n"
                + "Silahkan masukkan pilihan Anda : ");
    }
    public static void main(String[] args) {
        Circular_Array myQueue = new Circular_Array();
        Method_Main obj = new Method_Main();
        try{
            while(true)
            {
                obj.printPilihan();
                Scanner input = new Scanner(System.in);
                String pilih;
                int pilihan = input.nextInt();
                switch (pilihan)
                {
                    case 1:
                    {
                        System.out.println("Inserting data to queue...");
                        do{
                            System.out.print("Masukkan NIM\t: ");
                            String nim = input.next();
                            System.out.print("Masukkan Nama\t: ");
                            String nama = input.next();
                            System.out.print("Masukkan Alamat\t: ");
                            String alamat = input.next();
                            myQueue.enqueue(new Data(nim, nama, alamat));
                            System.out.print("Memasukkan data lagi ? Y(ya) / else (tidak) : ");
                            pilih = input.next();
                        }while(pilih.equals("Y") || pilih.equals("y"));break;
                    }
                    case 2:
                    {
                        System.out.println("Taking data in queue...");
                        Data temp = myQueue.dequeue();
                        if(temp==null)
                            System.out.println("Maaf Stack kosong");
                        else
                            System.out.println("Data yang diambil adalah : \n"
                                    + "NIM\t: "+temp.nim+"\n"
                                    + "Nama\t: "+temp.nama+"\n"
                                    + "Alamat\t: "+temp.alamat);break;
                    }
                    case 3:
                    {
                        System.out.println("Making a queue empty...");
                        myQueue.makeEmpty();break;
                    }
                    case 4:
                    {
                        System.out.println("Showing data in queue...\n"
                                + "The data in queue is :\n");
                        myQueue.show();break;
                    }
                    case 5:
                    {
                        System.out.println("Anda telah keluar, Thanks !");
                        System.exit(0);break;
                    }
                    default:System.out.println("Masukkan pilihan 1-5 !");      
                }
            }
        }catch(Exception e){
            System.out.println("Illegal Akses !\n"
                    + "Ulangi lagi run-file, masukkan angka 1-5 !");
        }
    }
}
