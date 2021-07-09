package gg.rizkirafiif;

public class main_Class {
    public static void main(String[] args) {
        // contoh run quicksort
        int[] array = new int[]{12, 4, 8, 5, 7, 3, 22, 4, 5, 13};
        System.out.println("Array sebelum di sort :");
        Quick_Sort.printArray(array);
        Quick_Sort.quickSort(array, 0, array.length-1);
        Quick_Sort.printArray(array);

        // contoh run mergesort
        int[] array2 = new int[]{12, 4, 8, 5, 7, 3, 22, 4, 5, 13};
        System.out.println("Array sebelum di sort :");
        Merge_Sort.printArray(array2);
        Merge_Sort.mergeSort(array2, 0, array2.length-1);
        Merge_Sort.printArray(array2);
    }
}