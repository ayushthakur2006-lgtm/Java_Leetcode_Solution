# 82. Remove Duplicates from Sorted List II

- **Problem Number**: 82
- **Difficulty**: Medium
- **LeetCode Link**: [Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)

## Problem Statement

You are given the head of a sorted linked list. Delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

## Approach

The implementation uses **Sentinel / Dummy Head Pattern** inside `deleteDuplicates(ListNode head) -> ListNode`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `deleteDuplicates(ListNode head) -> ListNode`.
2. **Core Traversal**: Apply **Sentinel / Dummy Head Pattern** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Singly Linked List (`ListNode`)
- **Algorithm / Technique**: Sentinel / Dummy Head Pattern

## Java Solution

The complete Java implementation is available in [`RemoveDuplicatesFromSortedListII.java`](./RemoveDuplicatesFromSortedListII.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - A new linked list proportional to input length is constructed.

## Key Takeaways

- Choosing **sentinel / dummy head pattern** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
