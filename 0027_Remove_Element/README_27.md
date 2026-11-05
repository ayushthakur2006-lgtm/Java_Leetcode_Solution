# 27. Remove Element

- **Problem Number**: 27
- **Difficulty**: Easy
- **LeetCode Link**: [Remove Element](https://leetcode.com/problems/remove-element/)

## Problem Statement

Given an integer array nums and an integer val , remove all occurrences of val in nums in-place . The order of the elements may be changed. Then return the number of elements in nums which are not equal to val . Consider the number of elements in nums which are not equal to val be k , to get accepted, you need to do the following things: Change the array nums such that the first k elements of nums contain the elements which are not equal to val . The remaining elements of nums are not important as well as the size of nums . Return k . Custom Judge: The judge will test your solution with the following code: int[] nums = [...]; // Input array int val = ...; // Value to remove int[] expectedNums = [...]; // The expected answer with correct length. // It is sorted with no values equaling val. int k = removeElement(nums, val); // Calls your implementation assert k == expectedNums.length; sort(nums, 0, k); // Sort the first k elements of nums for (int i = 0; i < actualLength; i++) { assert nums[i] == expectedNums[i]; } If all assertions pass, then your solution will be accepted .

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `removeElement(int[] nums, int val) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `removeElement(int[] nums, int val) -> int`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`RemoveElement.java`](./RemoveElement.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
