# 128. Longest Consecutive Sequence

- **Problem Number**: 128
- **Difficulty**: Medium
- **LeetCode Link**: [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/)

## Problem Statement

Given an unsorted array of integers nums , return the length of the longest consecutive elements sequence. You must write an algorithm that runs in O(n) time.

## Approach

The implementation uses **Greedy / Running Optimum** inside `longestConsecutive(int[] nums) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `longestConsecutive(int[] nums) -> int`.
2. **Core Traversal**: Apply **Greedy / Running Optimum** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Hash Set (`HashSet`)
- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Greedy / Running Optimum

## Java Solution

The complete Java implementation is available in [`LongestConsecutiveSequence.java`](./LongestConsecutiveSequence.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n^2)$
  - Nested loops iterate over element pairs.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **greedy / running optimum** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
