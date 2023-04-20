import java.util.Random;

public class ArrayOperations {

    private int[][] array;
    private int numRows;
    private int numCols;

    public ArrayOperations(int numRows, int numCols) {
        array = new int[numRows][numCols];
        this.numRows = numRows;
        this.numCols = numCols;
        // заполнение массива случайными значениями от 0 до 1
        Random random = new Random();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                array[i][j] = random.nextInt(201) - 100;
            }
        }
    }

    // прямой доступ к элементам массива
    public int getElement(int row, int col) {
        return array[row][col];
    }

    // доступ посредством векторов Айлиффа
    public int getHilbertElement(int n) {
        int row = n - 1;
        int col = 0;
        if (row > numCols - 1) {
            col = row - (numCols - 1);
            row = numCols - 1;
        }
        return array[row][col];
    }

    // метод определяющий векторы
    public int[] getColumnVector(int col) {
        int[] vector = new int[numRows];
        for (int i = 0; i < numRows; i++) {
            vector[i] = array[i][col];
        }
        return vector;
    }
}