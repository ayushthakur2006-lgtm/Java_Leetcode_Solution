# 41. First Missing Positive

- **Problem Number**: 41
- **Difficulty**: Hard
- **LeetCode Link**: [First Missing Positive](https://leetcode.com/problems/first-missing-positive/)

## Problem Statement

Given an unsorted integer array nums . Return the smallest positive integer that is not present in nums . You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `firstMissingPositive(int[] nums) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `firstMissingPositive(int[] nums) -> int`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`FirstMissingPositive.java`](./FirstMissingPositive.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
