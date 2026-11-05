# 31. Next Permutation

- **Problem Number**: 31
- **Difficulty**: Medium
- **LeetCode Link**: [Next Permutation](https://leetcode.com/problems/next-permutation/)

## Problem Statement

A permutation of an array of integers is an arrangement of its members into a sequence or linear order. For example, for arr = [1,2,3] , the following are all the permutations of arr : [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1] . The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order). For example, the next permutation of arr = [1,2,3] is [1,3,2] . Similarly, the next permutation of arr = [2,3,1] is [3,1,2] . While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement. Given an array of integers nums , find the next permutation of nums . The replacement must be in place and use only constant extra memory.

## Approach

The implementation uses **Two Pointers (convergent inward scan)** inside `nextPermutation(int[] nums) -> void`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `nextPermutation(int[] nums) -> void`.
2. **Core Traversal**: Apply **Two Pointers (convergent inward scan)** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Two Pointers (convergent inward scan)

## Java Solution

The complete Java implementation is available in [`NextPermutation.java`](./NextPermutation.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **two pointers (convergent inward scan)** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
