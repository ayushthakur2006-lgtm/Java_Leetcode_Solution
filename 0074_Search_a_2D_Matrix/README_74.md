# 74. Search a 2D Matrix

- **Problem Number**: 74
- **Difficulty**: Medium
- **LeetCode Link**: [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/)

## Problem Statement

You are given an m x n integer matrix matrix with the following two properties: Each row is sorted in non-decreasing order. The first integer of each row is greater than the last integer of the previous row. Given an integer target , return true if target is in matrix or false otherwise . You must write a solution in O(log(m * n)) time complexity.

## Approach

The implementation uses **Binary Search** inside `searchMatrix(int[][] matrix, int target) -> boolean`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `searchMatrix(int[][] matrix, int target) -> boolean`.
2. **Core Traversal**: Apply **Binary Search** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Binary Search

## Java Solution

The complete Java implementation is available in [`SearchA2dMatrix.java`](./SearchA2dMatrix.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(\log n)$
  - The problem space is halved at each step.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **binary search** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
