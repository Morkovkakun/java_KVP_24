package lesson9;

public class Task4 {
    public static void main(String[] args) {

        char[][] array = {
                {'0', '1'},
                {'2', '3'},
                {'4', '5'},
                {'6', '7'}
        };
        for (char[] arrayOne : array) {
            for (char element : arrayOne) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
