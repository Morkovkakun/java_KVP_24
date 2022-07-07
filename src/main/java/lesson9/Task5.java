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
        int a = 0;
        do {
            Arrays.sort(array[a]);
            a = a + 1;
        } while (a < 5);

        int[][] minMaxArrayElement = new int[5][2];
        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            int max = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (max < array[i][j]) max = array[i][j];
                if (min > array[i][j]) min = array[i][j];
            }
            minMaxArrayElement[i][1] = min;
            minMaxArrayElement[i][0] = max;
        }


        System.out.println((Arrays.deepToString(array)) + '\n' + Arrays.deepToString(minMaxArrayElement));


    }
}
