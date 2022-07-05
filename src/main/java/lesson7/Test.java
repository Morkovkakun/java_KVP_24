package lesson7;

import java.util.Scanner;

public class Test {

    /*    Создать программу, которая будет сообщать, является ли целое число,
        введённое пользователем, чётным или нечётным.
        Если пользователь введёт не целое число, то сообщать ему об ошибке.*/

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = reader.nextDouble();

        String evenOdd = (num % 2 == 0) ? "god" : "wrong";

        System.out.println(num + " is " + evenOdd);
    }
}


