package lesson6;

import java.util.Scanner;

public class Test1 {
    /*    Создать программу, которая будет выводить на экран меньшее
        по модулю из трёх введённых пользователемвещественных чисел.
        Для вычисления модуля используйте тернарную условную операцию.*/

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number 1: ");
        int num = reader.nextInt();
        int mod1 = num < 0 ? -num : num;

        System.out.print("Enter a number 2: ");
        int num1 = reader.nextInt();
        int mod2 = num1 < 0 ? -num1 : num1;

        System.out.print("Enter a number 3: ");
        int num2 = reader.nextInt();
        int mod3 = num2 < 0 ? -num2 : num2;

        int min1 = Math.min(mod1, mod2);
        int min = Math.min(min1, mod3);

        System.out.println("min is " + min);
    }
}
//Вот если честно, wtf? Это так должно работать?Мне кажется нет