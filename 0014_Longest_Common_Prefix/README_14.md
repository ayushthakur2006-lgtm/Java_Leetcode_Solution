# 14. Longest Common Prefix

- **Problem Number**: 14
- **Difficulty**: Easy
- **LeetCode Link**: [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)

## Problem Statement

Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "" .

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `longestCommonPrefix(String[] strs) -> String`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `longestCommonPrefix(String[] strs) -> String`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`LongestCommonPrefix.java`](./LongestCommonPrefix.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n^2)$
  - Nested loops iterate over element pairs.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
