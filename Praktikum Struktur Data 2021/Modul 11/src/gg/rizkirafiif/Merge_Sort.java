package gg.rizkirafiif;

public class Merge_Sort {
    // method yang digunakan untuk dipanggil dikelas main
    // berisikan 2 rekursif juga
    public static void mergeSort(int a[], int left, int right){
        if (left<right){
            // variable midde untuk membagi 2 array
            int middle = left + (right - left) / 2;

            // rekursif atas untuk data 0 sampai middle
            mergeSort(a, left, middle);
            // rekursif bawah untuk data middle+1 sampai terakhir
            mergeSort(a, middle+1, right);

            // melakukan merge dan sort
            merge (a, left, middle, right);
        }
    }

    private static void merge(int[] a, int left, int middle, int right) {
        // variabel untuk menentukan ukuran array pada proses merge
        int n1 = middle - left + 1;
        int n2 = right-middle;

        // array bantuan
        int L[] = new int[n1];
        int R[] = new int[n2];

        // proses menyalin data ke array bantuan
        for (int i = 0; i < n1; i++) {
            L[i] = a[left + i];     // ada sedikit perubahan di line 32
        }
        for (int i = 0; i < n2; i++) {
            R[i] = a[middle + 1 + i];
        }

        // merge & sort
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2){
            // kalau data di L ke-i lebih kecil dari R ke-j
            // maka masukkan data ke array utama
            if (L[i] <= R[j]){
                a[k] = L[i];
                i++;
            }
            // jika sebaliknya maka masukkan data R ke aray utama
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        // jika ada sisa elemen yang tertinggal L[]
        while (i < n1){
            a[k] = L[i];
            i++;
            k++;
        }
        // jika ada sisa elemen yang tertingga di R[]
        while (j < n2){
           a[k] = R[j];
           j++;
           k++;
        }
    }

    // untuk mencetak arraynya
    public static void printArray(int a[]){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
