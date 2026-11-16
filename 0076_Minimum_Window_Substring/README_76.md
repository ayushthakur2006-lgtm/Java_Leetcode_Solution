# 76. Minimum Window Substring

- **Problem Number**: 76
- **Difficulty**: Hard
- **LeetCode Link**: [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)

## Problem Statement

Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t ( including duplicates ) is included in the window . If there is no such substring, return the empty string "" . The testcases will be generated such that the answer is unique .

## Approach

The implementation uses **Hash-Based Lookup / Complement Search** inside `minWindow(String s, String t) -> String`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `minWindow(String s, String t) -> String`.
2. **Core Traversal**: Apply **Hash-Based Lookup / Complement Search** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Hash Map (`HashMap`)
- **Algorithm / Technique**: Hash-Based Lookup / Complement Search

## Java Solution

The complete Java implementation is available in [`MinimumWindowSubstring.java`](./MinimumWindowSubstring.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **hash-based lookup / complement search** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
