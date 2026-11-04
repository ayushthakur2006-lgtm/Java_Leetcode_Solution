# 25. Reverse Nodes in k-Group

- **Problem Number**: 25
- **Difficulty**: Hard
- **LeetCode Link**: [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/)

## Problem Statement

Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list . k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is. You may not alter the values in the list&#39;s nodes, only nodes themselves may be changed.

## Approach

The implementation uses **Sentinel / Dummy Head Pattern** inside `reverseKGroup(ListNode head, int k) -> ListNode`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `reverseKGroup(ListNode head, int k) -> ListNode`.
2. **Core Traversal**: Apply **Sentinel / Dummy Head Pattern** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Singly Linked List (`ListNode`)
- **Algorithm / Technique**: Sentinel / Dummy Head Pattern

## Java Solution

The complete Java implementation is available in [`ReverseNodesInKGroup.java`](./ReverseNodesInKGroup.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n^2)$
  - Nested loops iterate over element pairs.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - A new linked list proportional to input length is constructed.

## Key Takeaways

- Choosing **sentinel / dummy head pattern** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
