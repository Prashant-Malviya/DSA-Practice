package Hashing;

import java.util.*;

public class P04_union_two_unsorted_arr {
    
   /*
    I/P: a[] = {15,20,5,15}
         b[] = {15,15,15,20,10}

    o/p: 4


    I/p: a[] = {10,12,15}
         b[] = {18,12}

    o/p: 4

    i/p: a[] = {3,3,3}
         b[] = {3,3}
    
    o/p: 1

    naive approach: 

    steps 1 - initialize : res = 0
    2 - create an auxiliary array dist[]
    3 - travers through a[]. for every element in a[] , check if it is present in dis[].
    if no a) increament res b) append the element to dist[]

    4) repeat step 3 for every element of b[]
   
   */ 


    static int unionCountEfficient(int[] a, int[] b){

        HashSet<Integer> h = new HashSet<>();

        for(int x : a)
            h.add(x);

        for(int x : b)
            h.add(x);

        return h.size();
    }

    public static void main(String[] args) {
        
        int[] a = {20,20,20,1,20,4,2};
        int[] b = {20,20,1,3,33};

        System.out.println(unionCountEfficient(a, b));
    }
}
