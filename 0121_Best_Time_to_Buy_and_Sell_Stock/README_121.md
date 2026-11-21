# 121. Best Time to Buy and Sell Stock

- **Problem Number**: 121
- **Difficulty**: Easy
- **LeetCode Link**: [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

## Problem Statement

You are given an array prices where prices[i] is the price of a given stock on the i th day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction . If you cannot achieve any profit, return 0 .

## Approach

The implementation uses **Greedy / Running Optimum** inside `maxProfit(int[] prices) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `maxProfit(int[] prices) -> int`.
2. **Core Traversal**: Apply **Greedy / Running Optimum** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Greedy / Running Optimum

## Java Solution

The complete Java implementation is available in [`BestTimeToBuyAndSellStock.java`](./BestTimeToBuyAndSellStock.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **greedy / running optimum** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
