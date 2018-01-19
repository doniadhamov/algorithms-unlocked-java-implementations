package uz.doni.adhamov._3_sorting_searching._3_insertion_sort;

import java.util.Arrays;

/**
 * Created by Doniyorbek Adhamov on 19-Jan-18.
 */
public class InsertionSort {
    public static void main(String[] args) {

        // an array
        int[] numbers = {12, 9, 3, 7, 14, 11};
        // the number of elements in array to sort
        int length = numbers.length;

        System.out.println("Unsorted: " + Arrays.toString(numbers));

        // sorting function
        insertionSort(numbers, length);

        System.out.println("Sorted:   " + Arrays.toString(numbers));
    }

    private static void insertionSort(int[] A, int n) {

        for (int i = 1; i < n; i++) {
            int key = A[i], j = i - 1;

            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }

            A[j + 1] = key;
        }
    }
}
