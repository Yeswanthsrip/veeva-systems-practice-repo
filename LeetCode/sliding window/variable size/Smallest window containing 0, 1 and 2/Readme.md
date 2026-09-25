# 📝 Smallest window containing 0, 1 and 2 (GeeksforGeeks)

🔗 [Problem Link](https://www.geeksforgeeks.org/problems/smallest-window-containing-0-1-and-2--170637/1)

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
sliding-window, two-pointer-algorithm, Strings

### 🚀 Performance
- **Runtime:** Successfully Evaluated
- **Memory:** N/A

---

### 📜 Problem Description

Given a string  **s**  consisting only of the characters ' **0'** , ' **1'**  and ' **2'** , determine the length of the  **smallest substring**  that contains all three characters at least once.

If no such substring exists, return  **-1** .

**Examples :**

```
Input: s = "10212"
Output: 3
Explanation: The substring "102" is the shortest substring that contains all three characters '0', '1', and '2', so the answer is 3.
```

```
Input: s = "12121"
Output: -1
Explanation: The character '0' is not present in the string, so no substring can contain all three characters '0', '1', and '2'. Hence, the answer is -1.
```

**Constraints:** 
1 ≤ s.size() ≤ 105