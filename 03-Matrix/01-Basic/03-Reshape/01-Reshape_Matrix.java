
import java.util.Arrays;

class Reshape_Matrix {

    public static void main(String[] args) {

        int mat[][] = {{1, 2, 3}, {4, 5, 6}};
        int r = 1;
        int c = 6;

        System.out.println(Arrays.toString(matrixReshape(mat, r, c)));
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {

        int rows = mat.length;
        int cols = mat[0].length;
        int total_elements = rows * cols;

        if (total_elements != r * c) {
            return mat;
        }

        int result[][] = new int[r][c];
        int k = 0;
        int l = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[k][l] = mat[i][j];

                l++;

                if (l == c) {
                    l = 0;
                    k++;
                }
            }
        }

        return result;
    }
}
