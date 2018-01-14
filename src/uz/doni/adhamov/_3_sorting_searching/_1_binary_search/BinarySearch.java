package uz.doni.adhamov._3_sorting_searching._1_binary_search;

/**
 * Created by Doniyorbek Adhamov on 12/20/2017.
 */
public class BinarySearch {
    public static void main(String[] args) {

        // array should be sorted
        int[] numbers = {1, 4, 7, 8, 13, 14, 17, 18, 29, 40, 51};

        int length = numbers.length;
        int result1 = binarySearch(numbers, length, 40);
        int result2 = binarySearch(numbers, length, 7);
        int result3 = binarySearch(numbers, length, 17);
        int result4 = binarySearch(numbers, length, 20);

        System.out.println("40 ->   " + result1);
        System.out.println("7  ->   " + result2);
        System.out.println("17 ->   " + result3);
        System.out.println("20 ->   " + result4);
    }

    private static int binarySearch(int[] A, int n, int x) {

        int p = 0, r = n - 1;

        while (p <= r) {
            int q = (p + r) / 2;

            if (A[q] == x) {
                return q;
            } else if (A[q] > x) {
                r = q - 1;
            } else {
                p = q + 1;
            }
        }

        // NOT-FOUND
        return -1;
    }
}
