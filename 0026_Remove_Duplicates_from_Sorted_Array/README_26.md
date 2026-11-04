# 26. Remove Duplicates from Sorted Array

- **Problem Number**: 26
- **Difficulty**: Easy
- **LeetCode Link**: [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

## Problem Statement

Given an integer array nums sorted in non-decreasing order , remove the duplicates in-place such that each unique element appears only once . The relative order of the elements should be kept the same . Consider the number of unique elements in nums to be k ​​​​​​​ ​​​​​​​. After removing duplicates, return the number of unique elements k . The first k elements of nums should contain the unique numbers in sorted order . The remaining elements beyond index k - 1 can be ignored. Custom Judge: The judge will test your solution with the following code: int[] nums = [...]; // Input array int[] expectedNums = [...]; // The expected answer with correct length int k = removeDuplicates(nums); // Calls your implementation assert k == expectedNums.length; for (int i = 0; i < k; i++) { assert nums[i] == expectedNums[i]; } If all assertions pass, then your solution will be accepted .

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `removeDuplicates(int[] nums) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `removeDuplicates(int[] nums) -> int`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`RemoveDuplicatesFromSortedArray.java`](./RemoveDuplicatesFromSortedArray.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
