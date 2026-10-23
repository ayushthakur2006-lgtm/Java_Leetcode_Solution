# 237. Delete Node in a Linked List

- **Problem Number**: 237
- **Difficulty**: Medium
- **LeetCode Link**: [Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/)

## Problem Statement

There is a singly-linked list `head` and we want to delete a node `node` in it. You are given the node to be deleted `node`. You will not be given access to the first node of `head`. All values of the linked list are unique, and it is guaranteed that the given node is not the last node in the linked list.

Delete the given node such that:
- The value of the given node should not exist in the linked list.
- The number of nodes in the linked list should decrease by one.
- All the values before `node` should be in the same order.
- All the values after `node` should be in the same order.

## Approach

Because there is no access to the `head` pointer or the predecessor of `node`, standard pointer redirection cannot be applied immediately at `node`. The implementation resolves this by propagating values forward through the remaining list until the tail is reached:

1. **Cascading Value Shift**:
   - Initialize pointer `curr = node` and `prev = null`.
   - Traverse the remaining sublist while `curr.next != null`:
     - Overwrite the current node's value with the next node's value: `curr.val = curr.next.val`.
     - Update `prev = curr`.
     - Advance `curr = curr.next`.
   - This shifts every subsequent node's value one step forward, effectively removing the target node's value from the list.
2. **Severing the Tail Node**:
   - After the loop reaches the final node (`curr.next == null`), the last node's value has already been copied into its predecessor (`prev`).
   - Disconnect the now redundant tail node by setting `prev.next = null`.

> [!NOTE]
> **Implementation Characteristic**: While the minimal $\mathcal{O}(1)$ trick only copies the immediate next node's value (`node.val = node.next.val`) and bypasses it (`node.next = node.next.next`), this implementation shifts values across the entire remaining tail of the list in $\mathcal{O}(k)$ time, where $k$ is the number of nodes following `node`. Both approaches achieve the required in-place deletion without access to `head`.

## Key Concepts

- **Value Overwriting**: Overcoming lack of predecessor access by updating node values rather than redirecting the incoming pointer to `node`.
- **Cascading Value Shift**: Moving trailing values forward iteratively to absorb the deleted position.
- **Tail Deletion**: Tracking the second-to-last node with `prev` to unlink the duplicated terminal node.

## Java Solution

The complete Java implementation is available in [`DeleteNodeInALinkedList.java`](./DeleteNodeInALinkedList.java).

## Complexity Analysis

Let $k$ be the number of nodes from `node` to the end of the list ($1 < k \le n$):

- **Time Complexity**: $\mathcal{O}(k)$
  - The `while` loop iterates $k - 1$ times from `node` to the last node.
  - In each iteration, value assignment and pointer updates take $\mathcal{O}(1)$ time.
  - In the worst case (when deleting the head node), $k = n$, yielding $\mathcal{O}(n)$ time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Modifications are made directly in-place on existing nodes using two reference pointers (`curr` and `prev`).

## Key Takeaways

- When the predecessor of a target node cannot be reached in a singly linked list, modifying node values can simulate deletion of the node structure.
- Tracking a trailing pointer (`prev`) enables cleanly severing the final redundant node after shifting values.
