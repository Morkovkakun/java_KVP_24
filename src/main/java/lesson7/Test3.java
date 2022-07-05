package lesson7;

import java.util.Scanner;

public class Test3 {
    /* Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов.
     Для преобразования из String в double используйте метод Double.parseDouble(String s)*/
    private static double getMin(double a, double b, double c) {

        return Math.abs(a) < Math.abs(b) ? (Math.abs(a) < Math.abs(c) ? a : c) : (Math.abs(b) < Math.abs(c) ? b : c);
                                        //(                 1               )     (                 2              )
    }

    private static double getDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("wrong type:");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a:");
        double a = getDouble(scanner);

        System.out.println("b:");
        double b = getDouble(scanner);

        System.out.println("c:");
        double c = getDouble(scanner);
        
        System.out.println("min: " + getMin(a, b, c));
    }
}
