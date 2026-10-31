# 19. Remove Nth Node From End of List

- **Problem Number**: 19
- **Difficulty**: Medium
- **LeetCode Link**: [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

## Problem Statement

Given the head of a linked list, remove the n th node from the end of the list and return its head.

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `removeNthFromEnd(ListNode head, int n) -> ListNode`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `removeNthFromEnd(ListNode head, int n) -> ListNode`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Singly Linked List (`ListNode`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`RemoveNthNodeFromEndOfList.java`](./RemoveNthNodeFromEndOfList.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
