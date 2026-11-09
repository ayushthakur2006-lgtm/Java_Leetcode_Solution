# 42. Trapping Rain Water

- **Problem Number**: 42
- **Difficulty**: Hard
- **LeetCode Link**: [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)

## Problem Statement

Given n non-negative integers representing an elevation map where the width of each bar is 1 , compute how much water it can trap after raining.

## Approach

The implementation uses **Greedy / Running Optimum** inside `trap(int[] height) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `trap(int[] height) -> int`.
2. **Core Traversal**: Apply **Greedy / Running Optimum** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Greedy / Running Optimum

## Java Solution

The complete Java implementation is available in [`TrappingRainWater.java`](./TrappingRainWater.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **greedy / running optimum** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
