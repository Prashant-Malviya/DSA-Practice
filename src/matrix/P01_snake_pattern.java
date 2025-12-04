package matrix;

/*
PROBLEM:
Print matrix in snake pattern

INTUITION:
Even row  → left to right
Odd row   → right to left

TIME:
O(r * c)

SPACE:
O(1)
*/

public class P01_snake_pattern {

    public static void printSnake(int[][] mat) {

        int r = mat.length;
        int c = mat[0].length;

        for (int i = 0; i < r; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < c; j++)
                    System.out.print(mat[i][j] + " ");
            } else {
                for (int j = c - 1; j >= 0; j--)
                    System.out.print(mat[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        printSnake(mat);
    }
}
