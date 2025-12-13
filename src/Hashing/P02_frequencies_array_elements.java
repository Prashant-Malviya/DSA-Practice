package Hashing;

import java.util.HashMap;
import java.util.Map;

public class P02_frequencies_array_elements {
    

    /*
    
    frequencies of array elements

    i/p: arr[] = {10,12,10,15,10,20,12,12}

    o/p: 10 3
         12 3
         15 1
         20 1
         
    i/p: arr] = {10,10,10,10}
    o/p: 10 4

    i/p: arr[] = {10,20}
    o/p: 10 1
         20 1

    */

    static void printFreqNaive(int[] arr, int n){

        for(int i=0; i<n; i++){

            boolean flag = false;

            //check if seen before
            for(int j=0; j<i; j++)
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            
            // if seen then ignore
            if(flag == true)
                continue;

            int freq = 1;

            // if not seen before count frequencies
            for(int j = i+1; j<n; j++)
                if(arr[i] == arr[j])
                    freq++;
            
            System.out.println(arr[i]+" "+freq);
        }
    }

    /*
    AS = O(n)
    TC = tetha(n)
    
    */

    static void printFreqEfficient(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x: arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }

    public static void main(String[] args) {
        

        int[] arr = {10,20,20,10,30,10};

        // printFreqNaive(arr, arr.length);

        printFreqEfficient(arr);
    }
}
