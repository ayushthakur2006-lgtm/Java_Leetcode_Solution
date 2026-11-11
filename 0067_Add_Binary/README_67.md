# 67. Add Binary

- **Problem Number**: 67
- **Difficulty**: Easy
- **LeetCode Link**: [Add Binary](https://leetcode.com/problems/add-binary/)

## Problem Statement

Given two binary strings a and b , return their sum as a binary string .

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `addBinary(String a, String b) -> String`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `addBinary(String a, String b) -> String`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: String Builder (`StringBuilder`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`AddBinary.java`](./AddBinary.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
