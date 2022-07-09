package lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int[] array1 = new int[]{0, 2, 5, 3};
        sort(array1);
    }

    public static void sort(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index  where sorting will stop:");
        int number = sc.nextInt();
        System.out.println("i j     array value              if");


        for (int i = 0; i < array.length; i++) {

            for (int j = number ; j > i; j--) {

                String doOrNot = "-";

                if (array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    doOrNot = (tmp == array[j - 1]) ? "" : "+";
                }
                System.out.println(i + " " + j + "   " + Arrays.toString(array) + "                " + doOrNot);
            }
        }
    }
}


