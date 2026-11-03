# 24. Swap Nodes in Pairs

- **Problem Number**: 24
- **Difficulty**: Medium
- **LeetCode Link**: [Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)

## Problem Statement

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list&#39;s nodes (i.e., only nodes themselves may be changed.)

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `swapPairs(ListNode head) -> ListNode`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `swapPairs(ListNode head) -> ListNode`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Singly Linked List (`ListNode`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`SwapNodesInPairs.java`](./SwapNodesInPairs.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
