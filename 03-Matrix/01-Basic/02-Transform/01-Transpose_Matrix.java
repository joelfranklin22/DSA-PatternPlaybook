
import java.util.Arrays;

class Transpose_Matrix {

    public static void main(String[] args) {

        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(Arrays.toString(transpose(matrix)));
    }

    static int[][] transpose(int[][] matrix) {

        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
