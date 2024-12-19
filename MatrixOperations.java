class Matrix {
    // Multiply two 2D matrices
    int[][] multiply(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int common = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Multiply a matrix with a scalar
    int[][] multiply(int[][] a, int scalar) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] * scalar;
            }
        }
        return result;
    }

    void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixOperations {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        int[][] mat1 = { { 1, 2 }, { 3, 4 } };
        int[][] mat2 = { { 5, 6 }, { 7, 8 } };
        int scalar = 2;

        System.out.println("Matrix Multiplication:");
        matrix.printMatrix(matrix.multiply(mat1, mat2));

        System.out.println("Matrix Scalar Multiplication:");
        matrix.printMatrix(matrix.multiply(mat1, scalar));
    }
}
