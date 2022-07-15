package lesson11.arrays;

public class Array {
    public static void main(String[] args) {

        Integer[][] array = {{1, 1}, {3, 8}};

        Integer[][] secondArray = {{6, 2}, {1, 2}};


        matrixAddition(array, secondArray);
        matrixMultiplication(array);

    }


    private static void matrixAddition(Integer[][] array, Integer[][] secondArray) {
        Integer[][] matrixAdditionArray = new Integer[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixAdditionArray[i][j] = array[i][j] + secondArray[i][j];
                System.out.print(matrixAdditionArray[i][j] + " ");
            }
        }

    }

    private static void matrixMultiplication(Integer[][] array) {
        Integer[][] matrixMultipliArray = new Integer[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixMultipliArray[i][j] = 2 * array[i][j];
                System.out.print(matrixMultipliArray[i][j] + " ");
            }
        }
    }
}
