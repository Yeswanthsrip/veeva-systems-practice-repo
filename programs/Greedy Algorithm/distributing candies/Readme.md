Distributing Candies

There are n students standing in a line. Each student is assigned a rating value. You are given candies to distribute to these students according to the following requirements:

Each student must receive at least one candy.
A student with a higher rating than their neighboring student(s) must receive more candies than those neighbors.

Find the minimum number of candies required to distribute among all the students.

Example 1

Input:

n = 4
ratings = [1, 5, 2, 1]

Output:

7

One possible distribution is:

Ratings:  1  5  2  1
Candies:  1  3  2  1

Total:

1 + 3 + 2 + 1 = 7
Example 2

Input:

n = 6
ratings = [8, 4, 3, 9, 2, 1]

Output:

12