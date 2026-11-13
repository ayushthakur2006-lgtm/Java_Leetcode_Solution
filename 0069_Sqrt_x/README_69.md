# 69. Sqrt(x)

- **Problem Number**: 69
- **Difficulty**: Easy
- **LeetCode Link**: [Sqrt(x)](https://leetcode.com/problems/sqrtx/)

## Problem Statement

Given a non-negative integer x , return the square root of x rounded down to the nearest integer . The returned integer should be non-negative as well. You must not use any built-in exponent function or operator. For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

## Approach

The implementation uses **Binary Search** inside `mySqrt(int x) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `mySqrt(int x) -> int`.
2. **Core Traversal**: Apply **Binary Search** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Algorithm / Technique**: Binary Search

## Java Solution

The complete Java implementation is available in [`SqrtX.java`](./SqrtX.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(\log n)$
  - The problem space is halved at each step.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **binary search** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
