package lesson9;


import java.util.Arrays;


public class Task5 {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4, 66, 6, 7, 8},
                {1, 2, 4, 5, 7, 3, 5, 6},
                {5, 8, 4, 2, 6, 8, 4, 6},
                {2, 4, 1, 6, 4, 6, 5, 1},
                {1, 32, 5, 63, 7, 3, 2, 24},
        };
        //штука сотрирует элементы массива
        int i = 0;
        do {
            Arrays.sort(array[i]);
            i= i + 1;
        } while (i < 5);

        int[][] minMaxArrayElement = {
                {0, 0},
                {0, 0},
                {0, 0},
                {0, 0},
                {0, 0},
        };

//по идее, я хотел просто копирвоать первую и последнюю цифру после сортировки элемента, но жизнь оказалась суровее и я в тупике
            System.arraycopy(array[0], 0, minMaxArrayElement[0], 0, minMaxArrayElement[0].length);

        System.out.println((Arrays.deepToString(array)) + '\n' + Arrays.deepToString(minMaxArrayElement));


    }
}
