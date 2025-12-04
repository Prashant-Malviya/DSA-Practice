package matrix;

/*
PROBLEM:
Print boundary elements of matrix

INTUITION:
1. Top row
2. Right column
3. Bottom row (reverse)
4. Left column (reverse)

EDGE CASES:
- Single row
- Single column

TIME:
O(r + c)

SPACE:
O(1)
*/

public class P02_boundary_traversal {

    static void printBoundary(int[][] mat) {

        int r = mat.length;
        int c = mat[0].length;

        if (r == 1) {
            for (int i = 0; i < c; i++)
                System.out.print(mat[0][i] + " ");
            return;
        }

        if (c == 1) {
            for (int i = 0; i < r; i++)
                System.out.print(mat[i][0] + " ");
            return;
        }

        for (int i = 0; i < c; i++)
            System.out.print(mat[0][i] + " ");

        for (int i = 1; i < r; i++)
            System.out.print(mat[i][c - 1] + " ");

        for (int i = c - 2; i >= 0; i--)
            System.out.print(mat[r - 1][i] + " ");

        for (int i = r - 2; i > 0; i--)
            System.out.print(mat[i][0] + " ");
    }

    public static void main(String[] args) {
        int[][] mat = {
            {11,2,33},
            {4,5,6},
            {7,8,10}
        };

        printBoundary(mat);
    }
}
