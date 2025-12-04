package matrix;

import utils.MatrixUtils;

/*
PROBLEM:
Transpose a matrix

APPROACH:
Swap (i, j) with (j, i) for j > i

CONSTRAINT:
Only works for square matrix (in-place)

TIME:
O(n²)

SPACE:
O(1)
*/

public class P03_transpose {

    //--------------------------------brute
    
/* naive soln
📌 Idea

Create a new matrix

Copy each element by reversing indices

T.C:- 
✅ Complexity (Detailed)

Time:
Every element visited once → R × C
✅ O(RC)

Space:
Extra matrix → C × R
❌ O(RC)

*/
    static void matTransposeBrute(int[][]mat){

        int R = mat.length;

        int C = mat[0].length;

        int[][] temp = new int[R][C];

        for(int i=0;i<R;i++){

            for(int j=0;j<C;j++){

                temp[i][j] = mat[j][i];
            }
        }

        for(int i=0;i<R;i++){

            for(int j=0;j<C;j++){

                mat[i][j] = temp[i][j];
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }

// ------------------------------------------Better

/*
    
Better soln

📌 Idea

⚠️ Only for square matrix

Transpose happens around main diagonal

Avoid double swaps → only swap where j > i


✅ Complexity (Detailed)

Time:
Upper triangle swaps ≈ n² / 2
✅ O(N²)

Space:
Only temporary variable
✅ O(1)

    */

    static void matTransposeBetter(int[][]mat){

        int n = mat.length;

        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

                MatrixUtils.swap(mat, i, j);
            }
        }

        
    }


    /*  ----------------------------------------------------------better

//only to just print mat or return when required or just displaying result

    O(R*C);
*/


static void matTransposeOptimized(int[][] mat) {

    int R = mat.length;
    int C = mat[0].length;

    // Traverse column-wise
    for (int j = 0; j < C; j++) {
        for (int i = 0; i < R; i++) {
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
    }
}


    public static void main(String[] args) {
        

        int[][] mat = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };

        // matTransposeBrute(mat);

        matTransposeBetter(mat);

       MatrixUtils.print(mat);
    }
}
