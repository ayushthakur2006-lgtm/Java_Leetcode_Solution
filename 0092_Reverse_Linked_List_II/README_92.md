# 92. Reverse Linked List II

- **Problem Number**: 92
- **Difficulty**: Medium
- **LeetCode Link**: [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/)

## Problem Statement

Given the head of a singly linked list and two integers left and right where left <= right , reverse the nodes of the list from position left to position right , and return the reversed list .

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `reverseBetween(ListNode head, int left, int right) -> ListNode`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `reverseBetween(ListNode head, int left, int right) -> ListNode`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Singly Linked List (`ListNode`)
- **Data Structure**: Dynamic Array (`ArrayList`/`List`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`ReverseLinkedListII.java`](./ReverseLinkedListII.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
