# 86. Partition List

- **Problem Number**: 86
- **Difficulty**: Medium
- **LeetCode Link**: [Partition List](https://leetcode.com/problems/partition-list/)

## Problem Statement

Given the head of a linked list and a value x , partition it such that all nodes less than x come before nodes greater than or equal to x . You should preserve the original relative order of the nodes in each of the two partitions.

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `partition(ListNode head, int x) -> ListNode`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `partition(ListNode head, int x) -> ListNode`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Singly Linked List (`ListNode`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`PartitionList.java`](./PartitionList.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - A new linked list proportional to input length is constructed.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
