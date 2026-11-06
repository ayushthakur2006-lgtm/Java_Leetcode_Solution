# 34. Find First and Last Position of Element in Sorted Array

- **Problem Number**: 34
- **Difficulty**: Medium
- **LeetCode Link**: [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

## Problem Statement

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. If target is not found in the array, return [-1, -1] . You must write an algorithm with O(log n) runtime complexity.

## Approach

The implementation uses **Binary Search** inside `searchRange(int[] nums, int target) -> int[]`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `searchRange(int[] nums, int target) -> int[]`.
2. **Core Traversal**: Apply **Binary Search** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Binary Search

## Java Solution

The complete Java implementation is available in [`FindFirstAndLastPositionOfElementInSortedArray.java`](./FindFirstAndLastPositionOfElementInSortedArray.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(\log n)$
  - The problem space is halved at each step.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **binary search** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
