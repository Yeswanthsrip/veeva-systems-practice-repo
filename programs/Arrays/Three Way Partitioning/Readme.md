# 📝 Three Way Partitioning (GeeksforGeeks)

🔗 [Problem Link](https://www.geeksforgeeks.org/problems/three-way-partitioning/1)

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
Arrays, Sorting

### 🚀 Performance
- **Runtime:** Successfully Evaluated
- **Memory:** N/A

---

### 📜 Problem Description

Given an array  **arr[]**  and a range  **a** ,  **b** . The task is to partition the array around the range such that the array is divided into three parts.

1. All elements smaller than  **a**  come first.
2. All elements in range  **a**  to  **b**  come next.
3. All elements greater than  **b**  appear in the end.

The individual elements of three sets can appear in any order. You are required to return the modified array.

**Note** : The generated output is true if you modify the given array successfully. Otherwise false.

**Examples:**

```
Input: arr[] = [1, 2, 3, 3, 4], a = 1, b = 2
Output: true
Explanation: One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be true.

```

```
Input: arr[] = [1, 4, 3, 6, 2, 1], a = 1, b = 3
Output: true
Explanation: One possible arrangement is: {1, 3, 2, 1, 4, 6}. If you return a valid arrangement, output will be true.
```