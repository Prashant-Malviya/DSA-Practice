
# Boundary Traversal of Matrix

---

## 🧠 Pattern
Boundary Traversal

---

## 💡 Intuition
Traverse only the outer boundary in order:
1. Top row
2. Right column
3. Bottom row (reverse)
4. Left column (reverse)

---

## ⚠️ Edge Cases
- Single row
- Single column

---

## 🧾 Traversal Order

Top → Right → Bottom → Left


---

## ⏱️ Complexity
- Time: `O(R + C)`
- Space: `O(1)`

---

## 🎯 Notes
- Always handle edge cases first
- Avoid duplicate printing at corners