# 2816. Double a Number Represented as a Linked List

- **Problem Number**: 2816
- **Difficulty**: Medium
- **LeetCode Link**: [Double a Number Represented as a Linked List](https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/)

## Problem Statement

You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes. Return the head of the linked list after doubling it .

## Approach

The implementation uses **Sentinel / Dummy Head Pattern** inside `doubleIt(ListNode head) -> ListNode`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `doubleIt(ListNode head) -> ListNode`.
2. **Core Traversal**: Apply **Sentinel / Dummy Head Pattern** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Singly Linked List (`ListNode`)
- **Algorithm / Technique**: Sentinel / Dummy Head Pattern

## Java Solution

The complete Java implementation is available in [`DoubleANumberRepresentedAsALinkedList.java`](./DoubleANumberRepresentedAsALinkedList.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - A new linked list proportional to input length is constructed.

## Key Takeaways

- Choosing **sentinel / dummy head pattern** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
