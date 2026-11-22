# 122. Best Time to Buy and Sell Stock II

- **Problem Number**: 122
- **Difficulty**: Medium
- **LeetCode Link**: [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)

## Problem Statement

You are given an integer array prices where prices[i] is the price of a given stock on the i th day. On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can sell and buy the stock multiple times on the same day , ensuring you never hold more than one share of the stock. Find and return the maximum profit you can achieve .

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `maxProfit(int[] prices) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `maxProfit(int[] prices) -> int`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`BestTimeToBuyAndSellStockII.java`](./BestTimeToBuyAndSellStockII.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n^2)$
  - Nested loops iterate over element pairs.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
