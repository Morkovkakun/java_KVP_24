package testMy;


import java.util.Arrays;

public class testOne {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 4};
        int n = a.length;
        stableSelectionSort(a, n);
    }


    static void stableSelectionSort(int[] a, int n) {

        for (int i = 0; i < n - 1; i++) {


            int min = i;
            for (int j = i + 1; j < n; j++)
                if (a[min] > a[j])
                    min = j;

            // Move minimum element at current i.
            int key = a[min];
            while (min > i) {
                a[min] = a[min - 1];
                min--;

            }
            a[i] = key;
            String doOrNot = (min > i) ? "-" : "+";
            System.out.println(i + "  " + min + "   " + Arrays.toString(a) + "                " + doOrNot);
        }
    }

}



