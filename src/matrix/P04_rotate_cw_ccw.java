package matrix;

import utils.MatrixUtils;

/*
PROBLEM:
Rotate matrix 90° anti-clockwise

NAIVE APPROACH:
Use extra matrix

TIME:
O(n²)

SPACE:
O(n²)

*/

public class P04_rotate_cw_ccw {

    static void rotateCCW(int[][] mat) {

        int n = mat.length;
        int[][] temp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[n - 1 - j][i] = mat[i][j];
            }
        }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = temp[i][j];
    }


    // Efficient soln

    /*
    ⏱ Time & Space Complexity

Transpose step:

~half of the matrix elements swapped

Operations ≈ N²/2 → O(N²)

Reverse columns step:

Each column has N elements

N columns → N × N/2 swaps → O(N²)
    
    
    */

    static void rotateCCWEfficient(int[][]mat){

        int n = mat.length;

        // transpose the matrix

        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

                MatrixUtils.swap(mat, i, j);
            }
        }

        // reverse each individual column

        for(int col = 0; col<n;col++){

            int top = 0;

            int bottom = n-1;

            while(top<bottom){
                int temp = mat[top][col];

                mat[top][col] = mat[bottom][col];

                mat[bottom][col] = temp;

                top++; bottom--;
            }
        }
    }

    // --------------------------

    // Rotate a square matrix 90 degrees anti-clockwise (CCW) in-place
static void rotate90CCW_MostEfficient(int[][] mat) {
    int n = mat.length;

    // Process each layer
    for (int layer = 0; layer < n / 2; layer++) {

        int first = layer;          // starting index of this layer
        int last  = n - 1 - layer;  // ending index of this layer

        // Rotate the current layer
        for (int i = first; i < last; i++) {
            int offset = i - first;

            // Save top element
            int top = mat[first][i];

            // right → top
            mat[first][i] = mat[i][last];

            // bottom → right
            mat[i][last] = mat[last][last - offset];

            // left → bottom
            mat[last][last - offset] = mat[last - offset][first];

            // top (saved) → left
            mat[last - offset][first] = top;
        }
    }
}


    public static void main(String[] args) {

        int[][] mat = {
            {1,2,3,47},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        // rotateCCWEfficient(mat);

        rotate90CCW_MostEfficient(mat);
        MatrixUtils.print(mat);
    }
}
