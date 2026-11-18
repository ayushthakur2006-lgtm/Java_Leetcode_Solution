# 83. Remove Duplicates from Sorted List

- **Problem Number**: 83
- **Difficulty**: Easy
- **LeetCode Link**: [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)

## Problem Statement

Given the head of a sorted linked list, delete all duplicates such that each element appears only once . Return the linked list sorted as well .

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `deleteDuplicates(ListNode head) -> ListNode`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `deleteDuplicates(ListNode head) -> ListNode`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Singly Linked List (`ListNode`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`RemoveDuplicatesFromSortedList.java`](./RemoveDuplicatesFromSortedList.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
