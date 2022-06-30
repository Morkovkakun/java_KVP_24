package lesson5;

public class test {
    //однострочные

    /*многострочные
    комментарии*/
    public static void main(String args[]) {

        //логический литерал
        boolean bool = true;

        //строковый литерал
        String string = "hello";

        //символьный литерал
        char c = 'c';

        //целочисленный 2-й литерал
        int five = 0b101;

        //целочисленный 8-й литерал
        int nine = 011;

        //целочисленный 10-й литерал
        int ten = 10;

        //целочисленный 16-й литерал
        int a1 = 0X0005;

        //float
        float f = 99.99f;

        //double
        double d = 1.5;

        System.out.println(bool + "\n" + string + "\n" + c + "\n" + five + "\n" + nine + "\n" + ten + "\n" + a1 + "\n" + f + "\n" + d + "\n" + "end of literal");

        sumMethods();
        difMethods();
        prodMethods();
        divMethods();

        System.out.println(sumMethods() + "\n" + difMethods() + "\n" + prodMethods() + "\n" + divMethods() + "\n" + "end of methods");

    }

    public static int sumMethods() {
        int a = 6, b = 2;

        return a + b;
    }

    public static int difMethods() {
        int a = 6, b = 2;

        return a - b;
    }

    public static int prodMethods() {
        int a = 6, b = 2;

        return a / b;
    }

    public static int divMethods() {
        int a = 6, b = 2;

        return a * b;
    }
}


