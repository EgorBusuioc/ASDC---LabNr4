import java.util.Random;

/**
 * <h3>This class provides access to arrays in three different ways:</h3>
 * <p>1) direct access to vector elements.</p>
 * <p>2) access via Iliff vector.</p>
 * <p>3) the method of defining vectors.</p>
 * @see ArrayOperations#getElement(int, int)
 * @see ArrayOperations#getHilbertElement(int)
 * @see ArrayOperations#getColumnVector(int)
 *
 *
 * @version 1.0
 * @author EgorBusuioc
 */
public class ArrayOperations {

    private int[][] array;
    private int numRows;
    private int numCols;

    /**
     * <h3>Constructor with parameters of the <b>ArrayOperations</b> class for creating and filling an array with elements from -100 to 100</h3>
     *
     * @param numRows number of rows.
     * @param numCols number of columns.
     */
    public ArrayOperations(int numRows, int numCols) {
        array = new int[numRows][numCols];
        this.numRows = numRows;
        this.numCols = numCols;
        Random random = new Random();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                array[i][j] = random.nextInt(201) - 100;
            }
        }
    }

    /**
     * <h3>Direct access to vector elements</h3>
     * @param row number of rows
     * @param col number of columns
     * @return Array value at the position [row][column]
     */
    public int getElement(int row, int col) {
        return array[row][col];
    }

    /**
     * <h3>Access via Iliff vector.</h3>
     * @param n number of element, <b>starts from 1, not from 0</b>
     * @return Array value at the position [row][column]
     */
    public int getHilbertElement(int n) {
        int row = n - 1;
        int col = 0;
        if (row > numCols - 1) {
            col = row - (numCols - 1);
            row = numCols - 1;
        }
        return array[row][col];
    }

    /**
     * <h3>The method of defining vectors</h3>
     * @param col column number
     * @return Vector
     */
    public int[] getColumnVector(int col) {
        int[] vector = new int[numRows];
        for (int i = 0; i < numRows; i++) {
            vector[i] = array[i][col];
        }
        return vector;
    }
}