# 739. Daily Temperatures

- **Problem Number**: 739
- **Difficulty**: Medium
- **LeetCode Link**: [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)

## Problem Statement

Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the i th day to get a warmer temperature . If there is no future day for which this is possible, keep answer[i] == 0 instead.

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `dailyTemperatures(int[] temperatures) -> int[]`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `dailyTemperatures(int[] temperatures) -> int[]`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Dynamic Array (`ArrayList`/`List`)
- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`DailyTemperatures.java`](./DailyTemperatures.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n^2)$
  - Nested loops iterate over element pairs.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
