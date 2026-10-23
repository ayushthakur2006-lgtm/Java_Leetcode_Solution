# 50. Pow(x, n)

- **Problem Number**: 50
- **Difficulty**: Medium
- **LeetCode Link**: [Pow(x, n)](https://leetcode.com/problems/powx-n/)

## Problem Statement

Implement pow(x, n) , which calculates x raised to the power n (i.e., x n ).

## Approach

The implementation uses **Binary Exponentiation / Fast Power** inside `myPow(double x, int n) -> double`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `myPow(double x, int n) -> double`.
2. **Core Traversal**: Apply **Binary Exponentiation / Fast Power** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Algorithm / Technique**: Binary Exponentiation / Fast Power

## Java Solution

The complete Java implementation is available in [`PowXN.java`](./PowXN.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(\log n)$
  - The problem space is halved at each step.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **binary exponentiation / fast power** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
