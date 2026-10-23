# 237. Delete Node in a Linked List

- **Problem Number**: 237
- **Difficulty**: Medium
- **LeetCode Link**: [Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/)

## Problem Statement

There is a singly-linked list head and we want to delete a node node in it. You are given the node to be deleted node . You will not be given access to the first node of head . All the values of the linked list are unique , and it is guaranteed that the given node node is not the last node in the linked list. Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean: The value of the given node should not exist in the linked list. The number of nodes in the linked list should decrease by one. All the values before node should be in the same order. All the values after node should be in the same order. Custom testing: For the input, you should provide the entire linked list head and the node to be given node . node should not be the last node of the list and should be an actual node in the list. We will build the linked list and pass the node to your function. The output will be the entire list after calling your function.

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `deleteNode(ListNode node) -> void`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `deleteNode(ListNode node) -> void`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Singly Linked List (`ListNode`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`DeleteNodeInALinkedList.java`](./DeleteNodeInALinkedList.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
