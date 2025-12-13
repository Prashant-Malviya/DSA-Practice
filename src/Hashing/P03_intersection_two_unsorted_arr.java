package Hashing;

import java.util.HashSet;

public class P03_intersection_two_unsorted_arr {

    /*
    Intersection of two unsorted arrays
    
    i/p: a[] = {10,15,20,25,30,50}
         b[] = {30,5,15,80}

         o/p: 15 30

    i/p: a[] = {10,20}
         b[] = {20,30}

    o/p: 20

    i/p: a[] = {10,20,30}
         b[] = {30,20,10}

    o/p: 10 20 30
     */
    //TC - O(m*n)
    static void printIntersectionNaive(int[] a, int[] b) {

        int m = a.length, n = b.length;

        for (int i = 0; i < m; i++) {

            boolean flag = false;

            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag == true) {
                System.out.print(a[i] + " ");
            }
        }
    }

    // tc -> tetha(m+n);
    // Aux Space : tetha(n);

    static void printIntersectionEfficient(int a[], int[] b) {

        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < b.length; i++) {
            s.add(b[i]);
        }

        for (int i = 0; i < a.length; i++) {
            if (s.contains(a[i])) {
                System.out.println(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] a = {10,20,30};
        int[] b = {30,10};

        // printIntersectionNaive(a, b);

        printIntersectionEfficient(a, b);
    }
}
