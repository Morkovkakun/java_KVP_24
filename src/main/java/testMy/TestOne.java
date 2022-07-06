package testMy;

public class TestOne {


        public static void main(String[] args) {
            double d = getRandomValue(3);
            System.out.println(d);
        }


        public static double getRandomValue(int i) {
            return Math.random() * i;
        }
    }

