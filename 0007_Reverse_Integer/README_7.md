# 7. Reverse Integer

- **Problem Number**: 7
- **Difficulty**: Medium
- **LeetCode Link**: [Reverse Integer](https://leetcode.com/problems/reverse-integer/)

## Problem Statement

Given a signed 32-bit integer x , return x with its digits reversed . If reversing x causes the value to go outside the signed 32-bit integer range [-2 31 , 2 31 - 1] , then return 0 . Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `reverse(int x) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `reverse(int x) -> int`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: String Builder (`StringBuilder`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`ReverseInteger.java`](./ReverseInteger.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
