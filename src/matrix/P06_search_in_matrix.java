package matrix;


//problem:- Search in Row-Wise and Column-Wise Sorted Matrix
public class P06_search_in_matrix {

    //naive solution : O(R*C);

    static void searchNaive(int[][]mat,int x){

        int R = mat.length;
        int C = mat[0].length;

        for(int i=0;i<R;i++){

            for(int j=0;j<C;j++){

                if(mat[i][j] == x){

                    System.out.println("Found element - "+mat[i][j]+" at index "+ "mat["+i+"]"+"["+j+"]");
                    return;
                }
            }
        }

    }
    

    // =========================optimal or efficient way

    static void searchEfficient(int[][]mat, int x){

        int R = mat.length;

        int C = mat[0].length;

        for(int i=0;i<R;i++){


            if(x < mat[i][0] || x > mat[i][C-1])
                continue;


            int low = 0 , high = C-1;

            while(low <= high){

                int mid = low + (high-low)/2;

                if(mat[i][mid] == x){
                    System.out.println("Found element - "+mat[i][mid]+" at index "+ "mat["+i+"]"+"["+mid+"]");
                    return;
                }else if(mat[i][mid] < x){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }

    }
    // ------------------ more efficient way

    static void searchMoreEfficient(int[][] mat,int x){
        
        int R = mat.length;

        int C = mat[0].length;

        int i = 0, j = C-1;

        while(i<R && j>=0){

            int current = mat[i][j];

            if(current == x){
                System.out.println("Found element - "+mat[i][j]+" at index "+ "mat["+i+"]"+"["+j+"]");
                return;
            }else if(x < current){
                j--;
            }else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        
        int[][]mat = {
            {1,12,30},
            {23,55,67},
            {37,81,90}
        };

        // searchNaive(mat,55);

        // searchEfficient(mat, 81);

        searchMoreEfficient(mat, 37);
    }
}
