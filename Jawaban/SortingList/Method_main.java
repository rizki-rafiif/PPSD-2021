package gg.rizkirafiif.Jawaban.SortingList;
import java.util.Scanner;
public class Method_main {
    public static void printPilihan() {
        System.out.print("Pilihan Anda :\n"
                + "1.  Bubble Sort\n"
                + "2.  Optimalisasi Bubble Sort\n"
                + "3.  Selection Sort\n"
                + "4.  Insertion Sort\n"
                + "5.  Keluar\n"
                + "Silahkan masukkan pilihan Anda : ");
    }
static int temp;
static String pilih;
    public static void main (String[] args){
        Sorting mySort = new Sorting();
        Scanner input = new Scanner(System.in);
        try {
            while (true) {
                printPilihan();
                int pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                    {
                        System.out.println("Sorting dengan Bubble Sort");
                        do {
                            System.out.print("Masukkan data : ");
                            temp = input.nextInt();
                            mySort.addLast(new Node(temp));
                            System.out.print("Memasukkan data lagi ? Y(ya) / else (tidak) : ");
                            pilih = input.next();
                        } while (pilih.equals("Y") || pilih.equals("y"));
                        System.out.println("Data sebelum diurutkan : ");
                        mySort.show();
                        System.out.println("Data setelah diurutkan : ");
                        mySort.bubbleSort();
                        mySort.show();
                        mySort.clear();
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Sorting dengan Optimalisasi Bubble Sort");
                        do {
                            System.out.print("Masukkan data : ");
                            temp = input.nextInt();
                            mySort.addLast(new Node(temp));
                            System.out.print("Memasukkan data lagi ? Y(ya) / else (tidak) : ");
                            pilih = input.next();
                        } while (pilih.equals("Y") || pilih.equals("y"));
                        System.out.println("Data sebelum diurutkan : ");
                        mySort.show();
                        System.out.println("Data setelah diurutkan : ");
                        mySort.optBubbleSort();
                        mySort.show();
                        mySort.clear();
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Sorting dengan Selection Sort");
                        do {
                            System.out.print("Masukkan data : ");
                            temp = input.nextInt();
                            mySort.addLast(new Node(temp));
                            System.out.print("Memasukkan data lagi ? Y(ya) / else (tidak) : ");
                            pilih = input.next();
                        } while (pilih.equals("Y") || pilih.equals("y"));
                        System.out.println("Data sebelum diurutkan : ");
                        mySort.show();
                        System.out.println("Data setelah diurutkan : ");
                        mySort.selectionSort();
                        mySort.show();
                        mySort.clear();
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Sorting dengan Insertion Sort");
                        do {
                            System.out.print("Masukkan data : ");
                            temp = input.nextInt();
                            mySort.addLast(new Node(temp));
                            System.out.print("Memasukkan data lagi ? Y(ya) / else (tidak) : ");
                            pilih = input.next();
                        } while (pilih.equals("Y") || pilih.equals("y"));
                        System.out.println("Data sebelum diurutkan : ");
                        mySort.show();
                        System.out.println("Data setelah diurutkan : ");
                        mySort.insertionSort();
                        mySort.show();
                        mySort.clear();
                        break;
                    }
                    case 5: 
                    {
                        System.out.println("Anda telah keluar, Thanks");
                        System.exit(0);
                    }
                    default:System.out.println("Masukkan angka 1-5!");
                }
            }
        } catch (Exception e) {
            System.out.println("Illegal Akses !"
                    + " Ulangi lagi run-file, masukkan angka 1-5!");
        }
    }
}
