package lesson9;


public class Task6 {

    public static void main(String[] args) {

        byte[] array = new byte[4];
        array[0] = 32;
        array[1] = 32;
        array[2] = 32;
        array[3] = 32;

        for (int i = 0; i < 1; i++) {

            int blink = ~array[0];

            System.out.println("BLINK: " + Integer.toBinaryString(blink));
        }
        for (int i = 0; i < 5; i++) {

            int run = array[1] << i;

            System.out.println("RUN: " + Integer.toBinaryString(run));
        }
        for (int i = 0; i < 1; i++) {

            int mask =  array[2] ^ 3;
            int afterMask = mask ^ 3 ;

            System.out.println("MASK: " + Integer.toBinaryString(mask) +"   AFTER MASK:"  +Integer.toBinaryString(afterMask) );
        }
        for (int i = 0; i < 1; i++) {

            int show = array[i];

            System.out.println("SHOW: " + Integer.toBinaryString(show));
        }
        //я не понимаю :(
        //сожалею что вам приходится ЭТО лицезреть, правда
        //давайте я это как нибудь потом постараюсь переделать нормально

    }


}
