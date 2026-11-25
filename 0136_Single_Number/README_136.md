# 136. Single Number

- **Problem Number**: 136
- **Difficulty**: Easy
- **LeetCode Link**: [Single Number](https://leetcode.com/problems/single-number/)

## Problem Statement

Given a non-empty array of integers nums , every element appears twice except for one. Find that single one. You must implement a solution with a linear runtime complexity and use only constant extra space.

## Approach

The implementation uses **Sorting** inside `singleNumber(int[] nums) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `singleNumber(int[] nums) -> int`.
2. **Core Traversal**: Apply **Sorting** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Sorting
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`SingleNumber.java`](./SingleNumber.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n \log n)$
  - Dominated by the sorting step.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **sorting** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
