# 5. Longest Palindromic Substring

- **Problem Number**: 5
- **Difficulty**: Medium
- **LeetCode Link**: [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)

## Problem Statement

Given a string s , return the longest palindromic substring in s .

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `longestPalindrome(String s) -> String`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `longestPalindrome(String s) -> String`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Dynamic Array (`ArrayList`/`List`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`LongestPalindromicSubstring.java`](./LongestPalindromicSubstring.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
