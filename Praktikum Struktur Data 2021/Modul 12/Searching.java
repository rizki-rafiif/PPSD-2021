package com.gracia.modul12;

public class Searching {
    // DEKLARASI ATRIBUT
    static int temp, pos, i, j, start, end, mid, low, high;

//    SEQUENTIAL
    public static int sequential(int[] data, int cari){
//        Looping sebanyak elemen yang ada
        for(i=0; i<data.length; i++){
//            Mengecek data satu per satu
            if(data[i] == cari){
//                Jika data di temukan
                return i;
            }
        }
//        Jika data tidak ditemukan
        return -1;
    }

//    SELECTION SORT
    public static int[] selectionSort(int data[]){
        for(i=0; i<data.length-1; i++){
            pos = i;
            for(j=i+1; j<data.length; j++){
                if(data[j]<data[pos]){
                    pos = j;
                }
            }
            if(pos != i){
                temp = data[pos];
                data[pos] = data[i];
                data[i] = temp;
            }
        }
        return data;
    }

//    BINARY SEARCH
    public static int binarySearch(int[] data, int cari){
//        Memanggil method selection sort
        Searching.selectionSort(data);
//        Inisiasi nilai awal
        start = 0; end = data.length-1;
//        Looping selama nilai start <= end
        while(start<=end){
//            menentukan nilai tengah
            mid = (start + end)/2;
//            jika data yang ada di indeks tengah == data yang dicari
            if(data[mid] == cari){
//                nilai kembalian berupa indeks tengah
                return mid;
//                jika data pada indeks tengah < data yang dicari
            } else if (data[mid] < cari){
//                nilai start berubah = nilai tengah + 1
                start = mid + 1;
//                jika kondisi sebelumnya tidak terpenuhi
            } else {
//                nilai end berubah menjadi nilai tengah - 1
                end = mid - 1;
            }
        }
//        Jika data tidak ditemukan
        return -1;
    }

//   INTERPOLATION
    public static int interpolationSearch(int data[], int cari){
//        Memanggil method sorting
        Searching.selectionSort(data);
//        Inisiasi variable
        low = 0;
        high = data.length - 1;
//        Data yang dicari >= data[low] && data yang dicari <= data[high]
        while (cari>=data[low] && cari<=data[high]){
//            menentukkan indeks kunci
            pos = ((cari - data[low])/(data[high]-data[low]))*(high - low)+ low;
//            Jika data ke indeks kunci == data yang dicari
            if(data[pos] == cari){
//                return indeks kunci
                return pos;
            }
//            Jika data[pos] > data yang dicari
            if(data[pos]>cari){
//                nilai high = pos - 1
                high = pos - 1;
//                Jika data[pos] < data yang dicari
            } else if(data[pos] < cari){
//                nilai low = pos + 1
                low = pos + 1;
            }
        }
//        Jika data tidak ditemukan
        return -1;
    }
}
