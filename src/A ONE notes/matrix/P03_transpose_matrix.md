# Transpose of a Matrix

---

## 🧠 Pattern
Matrix Transformation

---

## 1️⃣ Naive Solution

### Idea
- Create a new matrix
- Copy elements using reversed indices

### Complexity
- Time: `O(R × C)`
- Space: `O(R × C)`

---

## 2️⃣ In-Place Solution ✅ (Square Matrix Only)

### Intuition
- Transpose happens along main diagonal
- Avoid double swaps → use `j > i`

```java
for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
        swap(mat[i][j], mat[j][i]);
    }
}

### ⏱️ Complexity

- Time: O(n²)

- Space: O(1)

### Notes

- In-place transpose works only for square matrix

- Rectangular matrix → use extra space