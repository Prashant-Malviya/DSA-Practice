# Snake Pattern Traversal

---

## 🧠 Pattern
Matrix Row Traversal

---

## 💡 Intuition
- Even indexed row → left to right
- Odd indexed row  → right to left

---

## 🧾 Algorithm
For each row `i`:
- If `i` is even → print normally
- Else → print in reverse order

---

## 🧑‍💻 Java Code

```java
if (i % 2 == 0) {
    for (int j = 0; j < c; j++)
        print(mat[i][j]);
} else {
    for (int j = c - 1; j >= 0; j--)
        print(mat[i][j]);
}


⏱️ Complexity

Time: O(R × C)

Space: O(1)