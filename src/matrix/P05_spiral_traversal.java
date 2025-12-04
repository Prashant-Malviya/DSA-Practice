package matrix;

public class P05_spiral_traversal {

    //boundary traversal

    static void spiralOptimal(int[][] mat){

        int R = mat.length;

        int C = mat[0].length;

        int top = 0, bottom = R-1;
        int left = 0, right = C-1;

        while(top <= bottom && left <= right){

            // top row

            for(int i = left; i<=right; i++){
                System.out.print(mat[top][i]+" ");
            }
            // System.out.println('\n');

            top++;

            //right column

            for(int i=top;i<=bottom;i++){
                System.out.print(mat[i][right]+" ");
            }

            // System.out.println('\n');

            right--;

            if(top <= bottom){

                for(int i=right;i>=left;i--){
                    System.out.print(mat[bottom][i]+" ");
                }
                // System.out.println('\n');
                bottom--;

                if(left <= right){
                    for(int i=bottom;i>=top;i--){
                        System.out.print(mat[i][left]+" ");
                    }
                    left++;
                    // System.out.println('\n');
                }
            }
        }
    }

    // -----------------

    static void spiralSteps(int[][] mat) {
    int R = mat.length;
    int C = mat[0].length;

    int r = 0, c = -1;
    int dir = 1; // moving right initially

    int rowSteps = R;
    int colSteps = C;

    while (rowSteps > 0 && colSteps > 0) {

        // Right / Left
        for (int i = 0; i < colSteps; i++) {
            c += dir;
            System.out.print(mat[r][c] + " ");
        }
        rowSteps--;

        // Up / Down
        for (int i = 0; i < rowSteps; i++) {
            r += dir;
            System.out.print(mat[r][c] + " ");
        }
        colSteps--;

        dir *= -1; // flip direction
    }
}

    
    public static void main(String[] args) {
        
        int[][] mat = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        // spiralOptimal(mat);

        spiralSteps(mat);

    }
}
