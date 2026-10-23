# 2913. Subarrays Distinct Element Sum of Squares I

- **Problem Number**: 2913
- **Difficulty**: Easy
- **LeetCode Link**: [Subarrays Distinct Element Sum of Squares I](https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/)

## Problem Statement

You are given a 0-indexed integer array nums . The distinct count of a subarray of nums is defined as: Let nums[i..j] be a subarray of nums consisting of all the indices from i to j such that 0 <= i <= j < nums.length . Then the number of distinct values in nums[i..j] is called the distinct count of nums[i..j] . Return the sum of the squares of distinct counts of all subarrays of nums . A subarray is a contiguous non-empty sequence of elements within an array.

## Approach

The implementation uses **Hash-Based Lookup / Complement Search** inside `sumCounts(List<Integer> nums) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `sumCounts(List<Integer> nums) -> int`.
2. **Core Traversal**: Apply **Hash-Based Lookup / Complement Search** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Hash Map (`HashMap`)
- **Data Structure**: Dynamic Array (`ArrayList`/`List`)
- **Algorithm / Technique**: Hash-Based Lookup / Complement Search

## Java Solution

The complete Java implementation is available in [`SubarraysDistinctElementSumOfSquaresI.java`](./SubarraysDistinctElementSumOfSquaresI.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **hash-based lookup / complement search** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
