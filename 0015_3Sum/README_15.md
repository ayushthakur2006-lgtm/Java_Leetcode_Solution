# 15. 3Sum

- **Problem Number**: 15
- **Difficulty**: Medium
- **LeetCode Link**: [3Sum](https://leetcode.com/problems/3sum/)

## Problem Statement

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j , i != k , and j != k , and nums[i] + nums[j] + nums[k] == 0 . Notice that the solution set must not contain duplicate triplets.

## Approach

The implementation uses **Sorting** inside `threeSum(int[] nums) -> List<List<Integer>>`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `threeSum(int[] nums) -> List<List<Integer>>`.
2. **Core Traversal**: Apply **Sorting** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Hash Map (`HashMap`)
- **Data Structure**: Hash Set (`HashSet`)
- **Data Structure**: Dynamic Array (`ArrayList`/`List`)
- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Sorting
- **Algorithm / Technique**: Hash-Based Lookup / Complement Search

## Java Solution

The complete Java implementation is available in [`3sum.java`](./3sum.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n \log n)$
  - Dominated by the sorting step.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **sorting** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
