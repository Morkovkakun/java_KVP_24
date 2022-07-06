package lesson8;

public class Task4 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        switch (a) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            default -> System.out.println("weekends");
        }


    }
}
