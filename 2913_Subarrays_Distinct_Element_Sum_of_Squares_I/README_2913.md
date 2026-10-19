# 2913. Subarrays Distinct Element Sum of Squares I

- **Problem Number**: 2913
- **Difficulty**: Easy
- **LeetCode Link**: [Subarrays Distinct Element Sum of Squares I](https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/)

## Problem Statement

You are given a 0-indexed integer array `nums`. The distinct count of a subarray is the number of distinct values in that subarray. Let the distinct count of subarray `nums[i..j]` be $d$. The score of that subarray is $d^2$. Return the sum of the squares of distinct counts of all subarrays of `nums`.

## Approach

The implementation uses a length-based window enumeration strategy that calculates the distinct count for every possible contiguous subarray using a hash map:

1. **Subarray Length Iteration**:
   - Initialize `int subArrayLength = 1` and `int sum = 0`.
   - The outer loop runs while `subArrayLength <= nums.size()`, exploring subarrays of size 1, 2, ..., $n$.
2. **Fixed-Length Window Slide**:
   - For a given `subArrayLength`, initialize `i = 0` and `j = i + subArrayLength`.
   - Slide the window across the array while `j <= nums.size()`:
     - Instantiate a new `HashMap<Integer, Integer> map = new HashMap<>()`.
     - Populate `map` with all elements in the slice `[i, j)` using a `for` loop from `k = i` to `j - 1`, tracking frequencies via `map.getOrDefault(..., 0) + 1`.
     - The number of distinct elements in this slice is `map.size()`.
     - Compute the squared distinct count `map.size() * map.size()` and add it to `sum`.
     - Shift window right by incrementing `i++` and `j++`.
3. **Advance Subarray Length**:
   - Increment `subArrayLength++` and repeat until all lengths up to $n$ are evaluated.
4. **Return**: Return `sum`.

## Key Concepts

- **Subarray Generation**: Enumerating all contiguous subarrays by sliding windows of fixed lengths from $1$ to $n$.
- **Frequency Map / Distinct Counting**: Using `HashMap<Integer, Integer>` to track frequencies and obtain distinct counts via `map.size()`.
- **Exhaustive Simulation**: Direct computation of problem terms matching the mathematical definition for each subarray.

## Java Solution

The complete Java implementation is available in [`SubarraysDistinctElementSumOfSquaresI.java`](./SubarraysDistinctElementSumOfSquaresI.java).

## Complexity Analysis

Let $n$ be the size of the input list `nums`:

- **Time Complexity**: $\mathcal{O}(n^3)$
  - There are $\frac{n(n + 1)}{2} = \mathcal{O}(n^2)$ total subarrays.
  - For each subarray of length $L$ ($1 \le L \le n$), the inner loop iterates $L$ times to populate the `HashMap`, taking $\mathcal{O}(L)$ operations.
  - The total time is $\sum_{L=1}^{n} (n - L + 1) \cdot L = \mathcal{O}(n^3)$.
  - Given the constraint for this problem ($n \le 100$), this approach runs well within typical runtime limits.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - In each window step, a `HashMap` is allocated holding at most $n$ distinct integer entries.
  - Old maps are discarded and reclaimed by garbage collection on each iteration.

## Key Takeaways

- Directly enumerating every subarray and recalculating unique elements from scratch provides an intuitive solution that is easy to verify.
- For larger input sizes (such as the hard version of this problem, LeetCode 2914/2262), the cubic runtime can be optimized to $\mathcal{O}(n^2)$ by expanding the subarray right endpoint incrementally and maintaining a persistent `HashSet`/frequency map, or to $\mathcal{O}(n)$ using segment trees / contribution counting.
