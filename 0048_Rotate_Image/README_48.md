# 48. Rotate Image

- **Problem Number**: 48
- **Difficulty**: Medium
- **LeetCode Link**: [Rotate Image](https://leetcode.com/problems/rotate-image/)

## Problem Statement

You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise). You have to rotate the image in-place , which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

## Approach

The implementation uses **Two Pointers (convergent inward scan)** inside `rotate(int[][] matrix) -> void`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `rotate(int[][] matrix) -> void`.
2. **Core Traversal**: Apply **Two Pointers (convergent inward scan)** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Two Pointers (convergent inward scan)

## Java Solution

The complete Java implementation is available in [`RotateImage.java`](./RotateImage.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n^2)$
  - Nested loops iterate over element pairs.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **two pointers (convergent inward scan)** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
