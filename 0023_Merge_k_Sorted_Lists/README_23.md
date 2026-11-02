# 23. Merge k Sorted Lists

- **Problem Number**: 23
- **Difficulty**: Hard
- **LeetCode Link**: [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)

## Problem Statement

You are given an array of k linked-lists lists , each linked-list is sorted in ascending order. Merge all the linked-lists into one sorted linked-list and return it.

## Approach

The implementation uses **Sorting** inside `mergeKLists(ListNode[] lists) -> ListNode`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `mergeKLists(ListNode[] lists) -> ListNode`.
2. **Core Traversal**: Apply **Sorting** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Singly Linked List (`ListNode`)
- **Data Structure**: Dynamic Array (`ArrayList`/`List`)
- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Sorting
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`MergeKSortedLists.java`](./MergeKSortedLists.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n \log n)$
  - Dominated by the sorting step.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **sorting** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
