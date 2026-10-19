# 739. Daily Temperatures

- **Problem Number**: 739
- **Difficulty**: Medium
- **LeetCode Link**: [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)

## Problem Statement

Given an array of integers `temperatures` representing daily temperatures, return an array `ans` such that `ans[i]` is the number of days you have to wait after the $i$-th day to get a warmer temperature. If there is no future day for which this is possible, keep `ans[i] = 0`.

## Approach

The implementation uses a **monotonic decreasing stack** simulated with an `ArrayList<Integer>` to look for the next warmer temperature while traversing from right to left:

1. **Array Initialization & Base Check**:
   - Allocate `int[] ans` of size `temperatures.length`.
   - If `temperatures.length == 0`, return `ans` directly.
2. **Stack Setup**:
   - Initialize `List<Integer> list = new ArrayList<>()` to serve as a stack storing indices of future days.
   - Seed the stack with the last day's index: `list.add(temperatures.length - 1)`.
3. **Right-to-Left Traversal**:
   - Iterate backwards using index `i` from `temperatures.length - 2` down to `0`.
   - **Pop Cooler / Equal Temperatures**:
     - While `list` is not empty and the temperature at the top of the stack (`temperatures[list.get(list.size() - 1)]`) is less than or equal to `temperatures[i]`:
       - Remove the top element from the stack (`list.remove(list.size() - 1)`).
       - Because those days are cooler than or equal to day `i` and occur after day `i`, they cannot be the first warmer day for any day preceding day `i`.
   - **Record Span**:
     - If the stack is not empty, the top element is the closest future day with a strictly higher temperature. Compute `ans[i] = list.get(list.size() - 1) - i`.
     - Otherwise, no warmer future day exists, so set `ans[i] = 0`.
   - **Push Current Day**:
     - Add index `i` to the stack (`list.add(i)`).
4. **Return**: Return `ans`.

## Key Concepts

- **Monotonic Decreasing Stack**: Maintaining indices of temperatures in strictly decreasing order so that warmer days are immediately accessible at the top of the stack.
- **Next Greater Element Pattern**: Solving for the nearest larger element in linear time instead of $\mathcal{O}(n^2)$ nested scans.
- **Dynamic Array as a Stack**: Utilizing `ArrayList.add()` and `ArrayList.remove(list.size() - 1)` for amortized $\mathcal{O}(1)$ push and pop operations.
- **Reverse Iteration**: Scanning from right to left so future day information is already processed and available in the stack.

## Java Solution

The complete Java implementation is available in [`DailyTemperatures.java`](./DailyTemperatures.java).

## Complexity Analysis

Let $n$ be the length of the `temperatures` array:

- **Time Complexity**: $\mathcal{O}(n)$
  - Each index from $0$ to $n - 1$ is added to `list` exactly once.
  - Each index is removed from `list` at most once across the entire execution.
  - While there is a nested `while` loop, the inner loop pops elements, and an element once popped is never re-evaluated.
  - Therefore, the total number of stack operations across all iterations is at most $2n$, yielding $\mathcal{O}(n)$ total time.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - The `list` stores indices and holds at most $n$ elements in the worst case (e.g., when temperatures are strictly decreasing).
  - The returned array `ans` requires $\mathcal{O}(n)$ space.

## Key Takeaways

- Problems asking for the "next greater/warmer element" can be reduced from $\mathcal{O}(n^2)$ brute force to $\mathcal{O}(n)$ using a monotonic stack.
- Traversing backwards from the end of the array simplifies tracking future indices, ensuring the stack always represents available future options.
