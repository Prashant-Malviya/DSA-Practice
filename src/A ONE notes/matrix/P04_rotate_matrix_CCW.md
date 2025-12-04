# Rotate Matrix 90° Anti-Clockwise

---

## 🧠 Pattern
Matrix Rotation (Square)

---

## 1️⃣ Naive Solution

### Formula
temp[n - 1 - j][i] = mat[i][j]

yaml
Copy code

### Complexity
- Time: `O(n²)`
- Space: `O(n²)`

---

## 2️⃣ Efficient Solution ✅

### Steps
1. Transpose matrix
2. Reverse each column

### Complexity
- Time: `O(n²)`
- Space: `O(1)`

---

## 3️⃣ Most Efficient (Layer-wise Rotation)

### Intuition
- Think in square layers
- Rotate elements in 4-way swap
- Right → Top
- Bottom → Right
- Left → Bottom
- Top → Left

---

## ⏱️ Complexity
- Time: `O(n²)`
- Space: `O(1)`

---

## 🎯  Notes
- Both efficient methods have same asymptotic TC
- Layer-wise solution shows stronger index control
