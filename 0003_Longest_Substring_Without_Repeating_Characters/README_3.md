# 3. Longest Substring Without Repeating Characters

- **Problem Number**: 3
- **Difficulty**: Medium
- **LeetCode Link**: [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

## Problem Statement

Given a string s , find the length of the longest substring without duplicate characters.

## Approach

The implementation uses **Greedy / Running Optimum** inside `lengthOfLongestSubstring(String s) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `lengthOfLongestSubstring(String s) -> int`.
2. **Core Traversal**: Apply **Greedy / Running Optimum** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Algorithm / Technique**: Greedy / Running Optimum

## Java Solution

The complete Java implementation is available in [`LongestSubstringWithoutRepeatingCharacters.java`](./LongestSubstringWithoutRepeatingCharacters.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **greedy / running optimum** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
