package lesson10;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] array1 = new int[]{0, 2, 5, 3, 4};
        System.out.println("i j   значение массива              if");
        sort(array1);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = array.length - 1; j > i; j--) {

                String doOrNot = "-";
                //сортировка в обратную сторону
                if (array[j - 1] < array[j]) {

                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    doOrNot = (tmp == array[j - 1]) ? "" : "+";
                }
                //досрочная остановка
                else if (array[j - 1] == array[j]) {
                    break;
                }


                System.out.println(i + " " + j + "   " + Arrays.toString(array) + "                " + doOrNot);
            }
        }
    }
}

