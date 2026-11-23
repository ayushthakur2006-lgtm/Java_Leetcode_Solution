# 125. Valid Palindrome

- **Problem Number**: 125
- **Difficulty**: Easy
- **LeetCode Link**: [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)

## Problem Statement

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers. Given a string s , return true if it is a palindrome , or false otherwise .

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `isPalindrome(String s) -> boolean`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `isPalindrome(String s) -> boolean`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`ValidPalindrome.java`](./ValidPalindrome.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
