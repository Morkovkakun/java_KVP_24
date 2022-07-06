package lesson8;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num > 0 & num < 10) {
            System.out.println("Положительное число меньше 10");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }
}
