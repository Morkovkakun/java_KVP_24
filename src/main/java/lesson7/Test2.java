package lesson7;

public class Test2 {

    public static void main(String[] args) {


        int l = 32;


        blink(l);
        run(l);
        mask(l);
        show(l);

    }

    static void blink(int l) {
int bl;
        bl = ~l;
        System.out.println(Integer.toBinaryString(bl));

    }

    static void run(int l) {

        l = l << 2;
        System.out.println(Integer.toBinaryString(l));

    }

    static void mask(int l) {

        l = l & 1;
        System.out.println(Integer.toBinaryString(l));

    }

    static void show(int l) {

        System.out.println(Integer.toBinaryString(l));

    }
}
