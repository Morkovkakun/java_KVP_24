package lesson7;

public class Test3 {
   /* Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов.
    Для преобразования из String в double используйте метод Double.parseDouble(String s)*/
    public static void main(String[] args) {
        String a = "5.5",b = "10.3",c = "15.1";
        double a1 = Double.parseDouble(a);
        double b1 = Double.parseDouble(b);
        double c1 = Double.parseDouble(c);
        var d = (a1 + b1 + c1) / 3;
        System.out.println(d);
    }
}
