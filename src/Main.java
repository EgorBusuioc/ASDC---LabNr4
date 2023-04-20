import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayOperations array = new ArrayOperations(30, 40);
        int[] colVec = array.getColumnVector(15);

        System.out.println("Direct access to vector elements: " + array.getElement(15, 17));
        System.out.println("Access via Ayliffe vectors: " + array.getHilbertElement(15));
        System.out.println("Get column Vector: " + Arrays.toString(colVec));
    }
}