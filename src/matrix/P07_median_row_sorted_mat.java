package matrix;

import java.util.Arrays;

public class P07_median_row_sorted_mat {


    static int matMedNaive(int[][]mat,int r, int c){

        int[] arr = new int[r*c];

        int idx = 0;

        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){
                arr[idx++] = mat[i][j];
            }
        }

        Arrays.sort(arr);

        return arr[(r*c)/2];
    }

   static int matMedEfficient(int mat[][], int r, int c)
{
    int min = mat[0][0], max = mat[0][c-1];

    for(int i = 1; i < r; i++)
    {
        if(mat[i][0] < min) min = mat[i][0];
        if(mat[i][c-1] > max) max = mat[i][c-1];
    }

    int medPos = (r * c + 1) / 2;

    while(min < max)
    {
        int mid = (min + max) / 2;
        int midPos = 0;

        for(int i = 0; i < r; i++)
        {
            int pos = Arrays.binarySearch(mat[i], mid) + 1;
            midPos += Math.abs(pos);
        }

        if(midPos < medPos)
            min = mid + 1;
        else
            max = mid;
    }
    return min;
}

    public static void main(String[] args) {
        
        int[][] mat = {
            { 1, 10, 20 },
            { 15, 25, 35 },
            { 5, 30, 40 },
        };

        // int median = matMedEfficient(mat, 3, 3);
        int median = matMedNaive(mat, 3,3);
        
        System.out.println(median);


    }

}