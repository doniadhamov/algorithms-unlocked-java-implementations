package uz.doni.adhamov;

/**
 * Created by Doniyorbek Adhamov on 07-Feb-18.
 */
public class Solution {
    public static void main(String[] args) {

        int counter = 0;
        double MISHKA = 0.5, KLAVIATURA = 3, MONITOR = 10;

        for (int iMonitor = 1; iMonitor <= 9; iMonitor++) {
            for (int iKlaviatura = 1; iKlaviatura <= 30; iKlaviatura++) {
                // 100 ga qoldiqli bo`linishi uchun, 10 ga karrali son qo`shilgandan keyingi sonlar yig`indilari ham 10 karrali bo`lishi kerak
                int difference = (int) (10 - (iKlaviatura * KLAVIATURA) % 10);
                difference = difference == 0 ? 20 : 2 * difference;

                for (int iMishka = difference; iMishka <= 98; iMishka += 20) {
                    int sumItems = iMishka + iKlaviatura + iMonitor;
                    if (sumItems == 100) {

                        double sum = iMishka * MISHKA + iKlaviatura * KLAVIATURA + iMonitor * MONITOR;
                        if (sum == 100) {
                            System.out.println(++counter + " -> " + iMishka + " " + iKlaviatura + " " + iMonitor);
                            break;
                        }
                    }
                } // end iMishka
            } // end iKlaviatura
        } // end iMonitor

    }
}
