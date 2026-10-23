# 2095. Delete the Middle Node of a Linked List

- **Problem Number**: 2095
- **Difficulty**: Medium
- **LeetCode Link**: [Delete the Middle Node of a Linked List](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/)

## Problem Statement

You are given the head of a linked list. Delete the middle node , and return the head of the modified linked list . The middle node of a linked list of size n is the &lfloor;n / 2&rfloor; th node from the start using 0-based indexing , where &lfloor;x&rfloor; denotes the largest integer less than or equal to x . For n = 1 , 2 , 3 , 4 , and 5 , the middle nodes are 0 , 1 , 1 , 2 , and 2 , respectively.

## Approach

The implementation uses **Fast and Slow Pointers (Tortoise and Hare)** inside `deleteMiddle(ListNode head) -> ListNode`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `deleteMiddle(ListNode head) -> ListNode`.
2. **Core Traversal**: Apply **Fast and Slow Pointers (Tortoise and Hare)** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Singly Linked List (`ListNode`)
- **Algorithm / Technique**: Fast and Slow Pointers (Tortoise and Hare)

## Java Solution

The complete Java implementation is available in [`DeleteTheMiddleNodeOfALinkedList.java`](./DeleteTheMiddleNodeOfALinkedList.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **fast and slow pointers (tortoise and hare)** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
