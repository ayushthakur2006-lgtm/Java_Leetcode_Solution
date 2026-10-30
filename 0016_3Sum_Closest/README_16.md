# 16. 3Sum Closest

- **Problem Number**: 16
- **Difficulty**: Medium
- **LeetCode Link**: [3Sum Closest](https://leetcode.com/problems/3sum-closest/)

## Problem Statement

You are given an integer array nums of length n and an integer target . Find three integers at distinct indices in nums such that the sum is closest to target . Return the sum of the three integers. You may assume that each input would have exactly one solution.

## Approach

The implementation uses **Sorting** inside `threeSumClosest(int[] nums, int target) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `threeSumClosest(int[] nums, int target) -> int`.
2. **Core Traversal**: Apply **Sorting** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Sorting
- **Algorithm / Technique**: Two Pointers (convergent inward scan)

## Java Solution

The complete Java implementation is available in [`3sumClosest.java`](./3sumClosest.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n \log n)$
  - Dominated by the sorting step.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **sorting** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
