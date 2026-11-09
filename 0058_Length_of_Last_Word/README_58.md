# 58. Length of Last Word

- **Problem Number**: 58
- **Difficulty**: Easy
- **LeetCode Link**: [Length of Last Word](https://leetcode.com/problems/length-of-last-word/)

## Problem Statement

Given a string s consisting of words and spaces, return the length of the last word in the string. A word is a maximal substring consisting of non-space characters only.

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `lengthOfLastWord(String s) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `lengthOfLastWord(String s) -> int`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`LengthOfLastWord.java`](./LengthOfLastWord.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
