# 21. Merge Two Sorted Lists

- **Problem Number**: 21
- **Difficulty**: Easy
- **LeetCode Link**: [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)

## Problem Statement

You are given the heads of two sorted linked lists list1 and list2 . Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list .

## Approach

The implementation uses **Sorting** inside `mergeTwoLists(ListNode list1, ListNode list2) -> ListNode`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `mergeTwoLists(ListNode list1, ListNode list2) -> ListNode`.
2. **Core Traversal**: Apply **Sorting** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Singly Linked List (`ListNode`)
- **Data Structure**: Dynamic Array (`ArrayList`/`List`)
- **Algorithm / Technique**: Sorting
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`MergeTwoSortedLists.java`](./MergeTwoSortedLists.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n \log n)$
  - Dominated by the sorting step.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **sorting** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
