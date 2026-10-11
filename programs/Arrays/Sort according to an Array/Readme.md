# 📝 Sort according to an Array (GeeksforGeeks)

🔗 [Problem Link](https://www.geeksforgeeks.org/problems/relative-sorting4323/1)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
Searching, Hash, Sorting

### 🚀 Performance
- **Runtime:** Successfully Evaluated
- **Memory:** N/A

---

### 📜 Problem Description

Given two integer arrays  **a1[]** and  **a2[]** . Sort the first array a1[] **** such that all the relative positions of the elements in the first array are the same as the elements in the second array a2[].
 **Note** : If elements are repeated in the second array, consider their first occurance only. Elements not in a2[] should appear in a1[] at the end in ascending order.

**Examples :**

```
Input: a1[] = [2, 1, 2, 3, 4], a2[] = [2, 1, 2]
Output: [2, 2, 1, 3, 4]
Explanation: Array elements of a1[] are sorted according to a2[]. So 2 comes first then 1 comes, now we append remaining elements of a1[] in sorted order.

```

```
Input: a1[] = [4, 1, 3, 3, 2], a2[] = [3, 1]
Output: [3, 3, 1, 2, 4]
Explanation: Elements 3 and 1 come first as per a2[]. Others (2, 4) are sorted and placed after.
```

**Constraints:** 
1 ≤ arr1.size(), arr2.size() ≤ 106
1 ≤ arr1[i], arr2[i] ≤ 106