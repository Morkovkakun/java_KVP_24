package lesson9;

public class Task3 {
    public static void main(String[] args) {

        String[][] any = new String[3][6];
        int i, j;
        char symbol = 'a';
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 6; j++) {

                any[i][j] = symbol + "" + (j + 1);

                System.out.print(any[i][j] + " ");

            }
            symbol++;
            System.out.println();
        }
    }
}
