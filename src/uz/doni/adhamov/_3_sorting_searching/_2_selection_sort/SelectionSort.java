package uz.doni.adhamov._3_sorting_searching._2_selection_sort;

import java.util.Arrays;

/**
 * Created by Doniyorbek Adhamov on 18-Jan-18.
 */
public class SelectionSort {
    public static void main(String[] args) {

        // an array
        int[] numbers = {12, 9, 3, 7, 14, 11};
        // the number of elements in array to sort
        int length = numbers.length;

        System.out.println("Unsorted: " + Arrays.toString(numbers));

        // sorting function
        selectionSort(numbers, length);

        System.out.println("Sorted:   " + Arrays.toString(numbers));
    }

    private static void selectionSort(int[] A, int n) {

        for (int i = 0; i < n - 1; i++) {
            int smallest = i;

            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[smallest]) {
                    smallest = j;
                }
            }

            swap(A, smallest, i);
        }
    }

    private static void swap(int[] A, int smallest, int i) {

        if (smallest != i) {
            int temp = A[i];
            A[i] = A[smallest];
            A[smallest] = temp;
        }
    }
}
