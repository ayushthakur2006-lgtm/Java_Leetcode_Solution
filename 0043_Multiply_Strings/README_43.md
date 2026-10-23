# 43. Multiply Strings

- **Problem Number**: 43
- **Difficulty**: Medium
- **LeetCode Link**: [Multiply Strings](https://leetcode.com/problems/multiply-strings/)

## Problem Statement

Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2 , also represented as a string. Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `multiply(String num1, String num2) -> String`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `multiply(String num1, String num2) -> String`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: String Builder (`StringBuilder`)
- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`MultiplyStrings.java`](./MultiplyStrings.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n^2)$
  - Nested loops iterate over element pairs.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
