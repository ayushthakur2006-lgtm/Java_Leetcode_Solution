# 1. Two Sum

- **Problem Number**: 1
- **Difficulty**: Easy
- **LeetCode Link**: [Two Sum](https://leetcode.com/problems/two-sum/)

## Problem Statement

You are given an array of integers nums and an integer target , return indices of the two numbers such that they add up to target . You may assume that each input would have exactly one solution , and you may not use the same element twice. You can return the answer in any order.

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `twoSum(int nums[], int target) -> int[]`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `twoSum(int nums[], int target) -> int[]`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Dynamic Array (`ArrayList`/`List`)
- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`TwoSum.java`](./TwoSum.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
