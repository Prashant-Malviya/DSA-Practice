# Matrix – DSA Patterns & Notes

---

## 1. Traversal Patterns

### ➤ Row-wise Traversal
- Left → Right
- Right → Left

### ➤ Snake Pattern
- Even rows → L → R
- Odd rows  → R → L

### ➤ Boundary Traversal
- Top row
- Right column
- Bottom row (reverse)
- Left column (reverse)

### ➤ Spiral Traversal
- Always move on boundary
- Shrink boundaries after one round
- Use: top, bottom, left, right

---

## 2. Search Patterns

### ➤ Brute Force
- Check every cell
- O(R × C)

### ➤ Row-wise Binary Search
- Each row sorted
- O(R × log C)

### ➤ Staircase Search ✅
- Matrix sorted row + column
- Start from top-right or bottom-left
- Eliminate one row or column each step
- O(R + C)

---

## 3. Transformation Patterns

### ➤ Transpose
- Swap (i, j) ↔ (j, i)
- In-place only for square matrix

### ➤ Rotation Tricks (Square Matrix)
| Rotation | Steps |
|--------|------|
| 90° CW | Transpose → Reverse rows |
| 90° CCW | Transpose → Reverse columns |

---

## 4. Golden  Questions
- Is matrix sorted row-wise / column-wise?
- Can I eliminate a row or column?
- Is in-place modification allowed?
- Is matrix square or rectangular?

---

## ✅ Revision Rule
> If you identify the pattern correctly,  
> **the code becomes mechanical.**
