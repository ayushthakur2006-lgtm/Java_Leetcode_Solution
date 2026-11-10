# 66. Plus One

- **Problem Number**: 66
- **Difficulty**: Easy
- **LeetCode Link**: [Plus One](https://leetcode.com/problems/plus-one/)

## Problem Statement

You are given a large integer represented as an integer array digits , where each digits[i] is the i th digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0 &#39;s. Increment the large integer by one and return the resulting array of digits .

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `plusOne(int[] digits) -> int[]`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `plusOne(int[] digits) -> int[]`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`PlusOne.java`](./PlusOne.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
