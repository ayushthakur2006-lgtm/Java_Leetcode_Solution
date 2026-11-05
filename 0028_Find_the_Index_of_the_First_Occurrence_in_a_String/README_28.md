# 28. Find the Index of the First Occurrence in a String

- **Problem Number**: 28
- **Difficulty**: Easy
- **LeetCode Link**: [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

## Problem Statement

Given two strings needle and haystack , return the index of the first occurrence of needle in haystack , or -1 if needle is not part of haystack .

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `strStr(String haystack, String needle) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `strStr(String haystack, String needle) -> int`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`FindTheIndexOfTheFirstOccurrenceInAString.java`](./FindTheIndexOfTheFirstOccurrenceInAString.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
