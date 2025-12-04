# Spiral Traversal of Matrix

---

## 🧠 Pattern
Boundary Shrinking

---

## 💡 Intuition
"Walk the boundary, then shrink it."

Use:
top, bottom, left, right


---

## Traversal Order
1. Top row → left to right
2. Right column → top to bottom
3. Bottom row → right to left
4. Left column → bottom to top

Shrink boundaries after each step.

---

## ⏱️ Complexity
- Time: `O(R × C)`
- Space: `O(1)`

---

## 🎯 Notes
- Very popular problem
- Boundary conditions are key

