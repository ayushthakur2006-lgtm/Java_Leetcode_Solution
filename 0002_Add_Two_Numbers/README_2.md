# 2. Add Two Numbers

- **Problem Number**: 2
- **Difficulty**: Medium
- **LeetCode Link**: [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)

## Problem Statement

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order , and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list. You may assume the two numbers do not contain any leading zero, except the number 0 itself.

## Approach

The implementation uses **Column-Wise Arithmetic with Carry Propagation** inside `addTwoNumbers(ListNode l1, ListNode l2) -> ListNode`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `addTwoNumbers(ListNode l1, ListNode l2) -> ListNode`.
2. **Core Traversal**: Apply **Column-Wise Arithmetic with Carry Propagation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Singly Linked List (`ListNode`)
- **Algorithm / Technique**: Column-Wise Arithmetic with Carry Propagation

## Java Solution

The complete Java implementation is available in [`AddTwoNumbers.java`](./AddTwoNumbers.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - A new linked list proportional to input length is constructed.

## Key Takeaways

- Choosing **column-wise arithmetic with carry propagation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
