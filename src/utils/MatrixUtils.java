package utils;

public class MatrixUtils {

    public static void print(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void swap(int[][] mat, int i , int j) {
       int temp = mat[i][j];

       mat[i][j] = mat[j][i];

       mat[j][i] = temp;
    }
}
