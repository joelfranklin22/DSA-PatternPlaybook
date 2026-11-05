
class Matrix_Diagonal_Sum {

    public static void main(String[] args) {

        int mat[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat) {

        int len = mat.length;
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {

            sum += mat[i][i];
            sum += mat[i][len - 1 - i];
        }
        if (len % 2 == 1) {
            sum -= mat[len / 2][len / 2];
        }

        return sum;
    }
}
