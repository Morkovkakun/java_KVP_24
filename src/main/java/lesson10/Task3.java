package lesson10;


import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        int[] array1 = new int[]{0, 2, 1, 5, 4};
        System.out.println("pos min   значение массива              if");
        sort(array1);
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];


            String doOrNot = "-";
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                    doOrNot = (array[j] < min) ? "" : "+";
                }
            }
            array[pos] = array[i];
            array[i] = min;

            System.out.println(pos + "  " + min + "   " + Arrays.toString(array) + "                " + doOrNot);
        }
    }
}

