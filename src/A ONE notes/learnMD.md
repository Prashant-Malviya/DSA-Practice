# 📌 Matrix (DSA Notes)

---

## ✅ What is a Matrix?
- A matrix is a **2D array** with rows and columns
- In Java: `int[][] mat`

---

## 🔹 Important Terms
- **Rows (R)** → `mat.length`
- **Columns (C)** → `mat[0].length`
- Element access → `mat[i][j]`

---

## ⭐ Common Matrix Patterns

### 1️⃣ Row-wise Traversal
#### ✅ Intuition
- Fix row
- Move column from left → right

```java
for (int i = 0; i < R; i++) {
    for (int j = 0; j < C; j++) {
        System.out.print(mat[i][j] + " ");
    }
}
