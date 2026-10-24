# 4. Median of Two Sorted Arrays

- **Problem Number**: 4
- **Difficulty**: Hard
- **LeetCode Link**: [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)

## Problem Statement

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)) .

## Approach

The implementation uses **Greedy / Running Optimum** inside `findMedianSortedArrays(int[] nums1, int[] nums2) -> double`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `findMedianSortedArrays(int[] nums1, int[] nums2) -> double`.
2. **Core Traversal**: Apply **Greedy / Running Optimum** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Greedy / Running Optimum

## Java Solution

The complete Java implementation is available in [`MedianOfTwoSortedArrays.java`](./MedianOfTwoSortedArrays.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **greedy / running optimum** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
