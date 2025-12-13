package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class P01_count_distinct_ele {

    /*
    i/p: arr[] = {12,14,13,12,14,13,18}
    
    o/p: 4

    i/p: arr[] = {10,10,10}
    o/p: 1

    i/p: arr[] = {10,11,12}
    o/p: 3
    */


    //naive soln
    // TC - O(n^2)
    // Aux Space - O(1)
    static int countDistinctNaive(int arr[]){

        int n = arr.length, res = 0;

        for(int i=0; i<n; i++){

            boolean flag = false;

            for(int j=0;j<i;j++){

                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }

            if(flag == false) res++;
        }
        return res;
    }

    /*
    
    TC -> tetha(n);
    Aus Space -> O(n);
    
    */

    static int countDistinctEfficient(int[] arr){ 

        HashSet<Integer> s = new HashSet<>();

        for(int i=0; i<arr.length;i++)
            s.add(arr[i]);

        return s.size();
    }

    static int countDistincteAnotherEfficient(Integer[] arr){

        HashSet<Integer> s = new HashSet<>(Arrays.asList(arr));

        return s.size();

    }
    
    public static void main(String[] args) {
        

        // int[] arr = {15,12,13,12,13,13,18};
        Integer[] arr = {15,12,13,12,13,13,18};

        // System.out.println(countDistinctNaive(arr));
        // System.out.println(countDistinctEfficient(arr));

        System.out.println(countDistincteAnotherEfficient(arr));
    }
}
