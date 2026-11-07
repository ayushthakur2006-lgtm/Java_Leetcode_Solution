# 35. Search Insert Position

- **Problem Number**: 35
- **Difficulty**: Easy
- **LeetCode Link**: [Search Insert Position](https://leetcode.com/problems/search-insert-position/)

## Problem Statement

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order. You must write an algorithm with O(log n) runtime complexity.

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `searchInsert(int[] nums, int target) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `searchInsert(int[] nums, int target) -> int`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`SearchInsertPosition.java`](./SearchInsertPosition.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
