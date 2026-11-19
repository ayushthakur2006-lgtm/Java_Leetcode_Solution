# 88. Merge Sorted Array

- **Problem Number**: 88
- **Difficulty**: Easy
- **LeetCode Link**: [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

## Problem Statement

You are given two integer arrays nums1 and nums2 , sorted in non-decreasing order , and two integers m and n , representing the number of elements in nums1 and nums2 respectively. Merge nums1 and nums2 into a single array sorted in non-decreasing order . The final sorted array should not be returned by the function, but instead be stored inside the array nums1 . To accommodate this, nums1 has a length of m + n , where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n .

## Approach

The implementation uses **Sorting** inside `merge(int[] nums1, int m, int[] nums2, int n) -> void`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `merge(int[] nums1, int m, int[] nums2, int n) -> void`.
2. **Core Traversal**: Apply **Sorting** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Sorting
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`MergeSortedArray.java`](./MergeSortedArray.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n \log n)$
  - Dominated by the sorting step.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **sorting** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
