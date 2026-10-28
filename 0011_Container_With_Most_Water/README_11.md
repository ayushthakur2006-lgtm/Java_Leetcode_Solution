# 11. Container With Most Water

- **Problem Number**: 11
- **Difficulty**: Medium
- **LeetCode Link**: [Container With Most Water](https://leetcode.com/problems/container-with-most-water/)

## Problem Statement

You are given an integer array height of length n . There are n vertical lines drawn such that the two endpoints of the i th line are (i, 0) and (i, height[i]) . Find two lines that together with the x-axis form a container, such that the container contains the most water. Return the maximum amount of water a container can store . Notice that you may not slant the container.

## Approach

The implementation uses **Two Pointers (convergent inward scan)** inside `maxArea(int[] height) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `maxArea(int[] height) -> int`.
2. **Core Traversal**: Apply **Two Pointers (convergent inward scan)** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Two Pointers (convergent inward scan)

## Java Solution

The complete Java implementation is available in [`ContainerWithMostWater.java`](./ContainerWithMostWater.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **two pointers (convergent inward scan)** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
