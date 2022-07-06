package lesson7;

import java.util.Scanner;

public class Test3 {
    /* Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов.
     Для преобразования из String в double используйте метод Double.parseDouble(String s)*/

    public static void main(String[] args) {
        System.out.println(" arg 1= " + args[0] + " arg 2= " + args[1] + " arg 3= " + args[2]);

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        System.out.println((a + b + c)/3);
    }
}
