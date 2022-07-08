package lesson10;


import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        int[] array1 = new int[]{0, 1, 2, 5, 4};
        System.out.println("pos min   значение массива              if");
        sort(array1);


    }


    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }

            //исключение, как я понял делается через индекс массива, но реализовать не смог

                array[pos] = array[i];
                array[i] = min;

            String doOrNot = (min == array[pos]) ? "-" : "+";
            System.out.println(pos + "  " + min + "   " + Arrays.toString(array) + "                " + doOrNot);
        }
    }
}


