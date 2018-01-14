package uz.doni.adhamov._3_sorting_searching._1_binary_search;

/**
 * Created by Doniyorbek Adhamov on 12/20/2017.
 */
public class RecursiveBinarySearch {
    public static void main(String[] args) {

        // array should be sorted
        int[] numbers = {1, 4, 7, 8, 13, 14, 17, 18, 29, 40, 51};

        int length = numbers.length;
        int result1 = recursiveBinarySearch(numbers, 0, length - 1, 40);
        int result2 = recursiveBinarySearch(numbers, 0, length - 1, 7);
        int result3 = recursiveBinarySearch(numbers, 0, length - 1, 17);
        int result4 = recursiveBinarySearch(numbers, 0, length - 1, 20);

        System.out.println("40 ->   " + result1);
        System.out.println("7  ->   " + result2);
        System.out.println("17 ->   " + result3);
        System.out.println("20 ->   " + result4);
    }

    private static int recursiveBinarySearch(int[] A, int p, int r, int x) {

        if (p > r) {
            // NOT-FOUND
            return -1;
        }

        int q = (p + r) / 2;

        if (A[q] == x) {
            return q;
        } else if (A[q] > x) {
            return recursiveBinarySearch(A, p, r - 1, x);
        } else {
            return recursiveBinarySearch(A, q + 1, r, x);
        }
    }
}
