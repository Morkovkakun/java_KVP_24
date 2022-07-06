package lesson8;

public class Task6 {
    public static void main(String[] args) {
        int i = 1;
        do {
            boolean rem = i % 5 == 0;
            if (rem) {
                System.out.println(i);
            }
            i++;
        } while (i < 100);
    }

}
