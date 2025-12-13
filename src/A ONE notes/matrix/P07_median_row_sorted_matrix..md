Example

Input

{
  { 1, 10, 20 },
  { 15, 25, 35 },
  { 5, 30, 40 }
}


Output

20


Explanation

Sorted array = [1, 5, 10, 15, 20*, 25, 30, 35, 40]
Median = 20

Assumptions

Matrix size is odd

Matrix is row-wise sorted

Elements are distinct

💡 Key Intuition

Median is the element at position

(R * C + 1) / 2


Instead of flattening the matrix:

Search between minimum and maximum values

For a guessed value mid, count:

How many elements are ≤ mid

Since rows are sorted, we can count efficiently using binary search on each row

✅ This avoids extra space
✅ Much faster than sorting all elements

🧾 Approach
1️⃣ Naive Solution — O(R*C log(R*C))

Step 1: Copy all elements into a 1D array → O(R*C)

Step 2: Sort the array → O(R*C log(R*C))

Step 3: Return middle element → O(1)

❌ Extra space
❌ Inefficient for large matrices

2️⃣ Efficient Solution — Binary Search on Value Space

Find:

min = smallest element (first column)

max = largest element (last column)

Binary search between min and max

For each mid, count elements ≤ mid using
Arrays.binarySearch()

Time:

O(log(max−min) × R × log C)


Space:

O(1)


✅ Optimal approach (interview preferred)

🧠 Pseudocode
find min from first column
find max from last column

medianPos = (R*C + 1) / 2

while min < max:
    mid = (min + max) / 2
    count = 0

    for each row:
        pos = binarySearch(row, mid)
        count += elements <= mid

    if count < medianPos:
        min = mid + 1
    else:
        max = mid

return min

🧑‍💻 Final Java Code (Optimized)
import java.util.*;

public class MatrixMedian {

    static int findMedian(int[][] mat, int R, int C) {

        int min = mat[0][0];
        int max = mat[0][C - 1];

        // Find global min and max
        for (int i = 1; i < R; i++) {
            min = Math.min(min, mat[i][0]);
            max = Math.max(max, mat[i][C - 1]);
        }

        int medPos = (R * C + 1) / 2;

        while (min < max) {
            int mid = (min + max) / 2;
            int midPos = 0;

            for (int i = 0; i < R; i++) {
                int pos = Arrays.binarySearch(mat[i], mid) + 1;
                midPos += Math.abs(pos);
            }

            if (midPos < medPos)
                min = mid + 1;
            else
                max = mid;
        }

        return min;
    }
}

🔄 Dry Run

Matrix:

5  10  20  30  40
1   2   3   4   6
11 13  15  17  19


min = 1, max = 40

medianPos = 8

mid	count (≤ mid)	action
20	13	max = 20
10	7	min = 11
15	10	max = 15
13	9	max = 13
12	8	max = 12
11	8	max = 11

✅ min == max == 11 → Median = 11

⏱️ Complexity

Time:
O(log(max−min) × R × log C)

Space:
O(1)

🎯 Notes

Binary search is done on values, not indices

Arrays.binarySearch() trick:

Found → index

Not found → -(insertionPoint) - 1

Math.abs(pos) gives count of elements ≤ mid

Works only when:

Rows are sorted

Total elements are odd