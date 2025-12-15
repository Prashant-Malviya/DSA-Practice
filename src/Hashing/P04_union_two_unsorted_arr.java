package Hashing;

import java.util.*;

public class P04_union_two_unsorted_arr {

    /*
     * I/P: a[] = {15,20,5,15}
     * b[] = {15,15,15,20,10}
     * 
     * o/p: 4
     * 
     * 
     * I/p: a[] = {10,12,15}
     * b[] = {18,12}
     * 
     * o/p: 4
     * 
     * i/p: a[] = {3,3,3}
     * b[] = {3,3}
     * 
     * o/p: 1
     * 
     * naive approach:
     * 
     * steps 1 - initialize : res = 0
     * 2 - create an auxiliary array dist[]
     * 3 - travers through a[]. for every element in a[] , check if it is present in
     * dis[].
     * if no a) increament res b) append the element to dist[]
     * 
     * 4) repeat step 3 for every element of b[]
     * 
     */

    // TC : - O(n+m)^2 , AuxSpace = O(n+m);

    static int unionCountNaive(int[] a, int[] b) {

        int n = a.length, m = b.length;

        int[] distinct = new int[n + m];

        int size = 0, res = 0;

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = 0; j < size; j++) {

                if (distinct[j] == a[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                distinct[size++] = a[i];
                res++;
            }
        }

        for (int i = 0; i < m; i++) {
            boolean found = false;

            for (int j = 0; j < size; j++) {
                if (distinct[j] == b[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                distinct[size++] = b[i];
                res++;
            }
        }

        return res;
    }

    /*
     * union count better
     * 
     * ⏱️ Time Complexity
     * 
     * Sorting → O(n log n + m log m)
     * 
     * Binary search → m log n
     * 
     * Overall: O(n log n + m log m)
     * 
     * 💾 Space Complexity
     * 
     * No extra array (apart from sorting) → O(1) auxiliary
     * 
     */

    static int unionCountBetter(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);

        int res = 0, n = a.length, m = b.length;

        // count distinct in a[]
        for (int i = 0; i < n; i++) {

            if (i == 0 || a[i] != a[i - 1]) {
                res++;
            }
        }

        // count distinct in b[] that are not in a[];
        for (int i = 0; i < m; i++) {
            if (i > 0 && b[i] == b[i - 1])
                continue;

            // binary search in a[]

            if (Arrays.binarySearch(a, b[i]) < 0) {
                res++;
            }
        }

        return res;
    }

    /*
     * ⏱️ Time Complexity
     * 
     * Average case hashing → O(n + m) ✅
     * 
     * 💾 Space Complexity
     * 
     * HashSet → O(n + m)
     * 
     */

    static int unionCountEfficient(int[] a, int[] b) {

        HashSet<Integer> h = new HashSet<>();

        for (int x : a)
            h.add(x);

        for (int x : b)
            h.add(x);

        return h.size();
    }

    public static void main(String[] args) {

        int[] a = { 20, 20, 20, 1, 20, 4, 2 };
        int[] b = { 20, 20, 1, 3, 33 };

        System.out.println("naive = " + unionCountNaive(a, b));
        System.out.println("better = " + unionCountBetter(a, b));
        System.out.println("efficient = " + unionCountEfficient(a, b));
    }
}
