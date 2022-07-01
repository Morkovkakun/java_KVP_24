package lesson6;

public class Test2 {

    public static void main(String[] args) {
/*
        Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена. В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
        a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~);
        б) метод, который будет запускать гирлянду в режим бегущей строки (операция  << или >>);
        в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
        г) метод который будет распечатывать текущее состояние гирлянды.
                Используйте побитовые операции. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).*/

        int l = 32;

        System.out.println(Integer.toBinaryString(l));
        blink(l);
        run(l);
        mask(l);

    }
    static void blink(int l) {

        System.out.println(Integer.toBinaryString(~l));

    }
    static void run(int l) {

        System.out.println(Integer.toBinaryString(l << 5));

    }
    static void mask(int l) {

        System.out.println(Integer.toBinaryString(l & 1));

    }
}
