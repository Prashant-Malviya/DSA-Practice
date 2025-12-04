# Search in Row-Wise & Column-Wise Sorted Matrix

---

## 🧠 Pattern
Matrix Search (Staircase)

---

## 💡 Key Intuition

Start from **top-right** corner.

At position (i, j):
- If equal → found
- If x smaller → move LEFT
- If x larger → move DOWN

Each move removes one row or column.


### why always right top element?

- we choose that because if we choose other corner element then we might need to go to whole mat if that is greater or smaller than itself, we only can take columns one is top right and other one is bottom left

---

## 🧾 Pseudocode

```text
i = 0, j = C - 1
while i < R and j >= 0:
    if mat[i][j] == x → found
    else if x < mat[i][j] → j--
    else → i++

⏱️ Complexity

Time: O(R + C)

Space: O(1)

🎯  Notes

- Known as Staircase Search

- Asked frequently in FAANG