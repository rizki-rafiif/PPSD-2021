package gg.rizkirafiif;

public class Quick_Sort {
    // method quicksort yang dipanggil pada kelas main
    // didalamnya terdapat rekursif
    static void quickSort(int[] a, int low, int high){
        if (low < high){
            // pi itu partition index
            int pi = partition(a, low, high);
            // 2 rekursif
            quickSort(a, low, pi-1);    // sampai sebelum pivot
            quickSort(a, pi+1, high);   // seluruh data termasuk pivot
        }
    }

    // method untuk proses partisinya
    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];    // menggunakan pivot data terakhir
        int i = (low-1);        //

        for (int j = low; j <= high-1 ; j++) {
            // pertukarn berdasarkan pivot
            if (a[j] < pivot){
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i+1, high);
        return (i+1);
    }

    // method untuk proses swap
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // method untuk mencetak array
    static void printArray(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
