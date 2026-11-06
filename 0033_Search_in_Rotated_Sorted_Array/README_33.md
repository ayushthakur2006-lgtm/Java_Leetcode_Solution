# 33. Search in Rotated Sorted Array

- **Problem Number**: 33
- **Difficulty**: Medium
- **LeetCode Link**: [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)

## Problem Statement

There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is possibly left rotated at an unknown index k ( 1 <= k < nums.length ) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] ( 0-indexed ). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2] . Given the array nums after the possible rotation and an integer target , return the index of target if it is in nums , or -1 if it is not in nums . You must write an algorithm with O(log n) runtime complexity.

## Approach

The implementation uses **Binary Search** inside `search(int[] nums, int target) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `search(int[] nums, int target) -> int`.
2. **Core Traversal**: Apply **Binary Search** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Binary Search

## Java Solution

The complete Java implementation is available in [`SearchInRotatedSortedArray.java`](./SearchInRotatedSortedArray.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(\log n)$
  - The problem space is halved at each step.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **binary search** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
