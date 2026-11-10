# 61. Rotate List

- **Problem Number**: 61
- **Difficulty**: Medium
- **LeetCode Link**: [Rotate List](https://leetcode.com/problems/rotate-list/)

## Problem Statement

Given the head of a linked list, rotate the list to the right by k places.

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `rotateRight(ListNode head, int k) -> ListNode`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `rotateRight(ListNode head, int k) -> ListNode`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Singly Linked List (`ListNode`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`RotateList.java`](./RotateList.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n^2)$
  - Nested loops iterate over element pairs.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
