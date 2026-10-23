# 2095. Delete the Middle Node of a Linked List

- **Problem Number**: 2095
- **Difficulty**: Medium
- **LeetCode Link**: [Delete the Middle Node of a Linked List](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/)

## Problem Statement

You are given the `head` of a linked list. Delete the middle node, and return the `head` of the modified linked list.

The middle node of a linked list of size $n$ is the $\lfloor n / 2 \rfloor$-th node from the start using 0-based indexing:
- For $n = 1$, index $\lfloor 1 / 2 \rfloor = 0$ is deleted.
- For $n = 2$, index $\lfloor 2 / 2 \rfloor = 1$ is deleted.
- For $n = 3$, index $\lfloor 3 / 2 \rfloor = 1$ is deleted.
- For $n = 4$, index $\lfloor 4 / 2 \rfloor = 2$ is deleted.

## Approach

The implementation uses the **fast and slow pointer (tortoise and hare)** technique to locate the middle node in a single pass while tracking its predecessor:

1. **Single-Node Edge Case**:
   - If `head.next == null`, the list consists of a single node ($n = 1$). Deleting the node at index 0 leaves an empty list, so set `head = null` and return `null`.
2. **Two-Pointer Traversal with Predecessor Tracking**:
   - Initialize `fast = head`, `slow = head`, and `prev = null`.
   - Traverse the list with the condition `while (fast != null && fast.next != null)`:
     - Update `prev = slow` to keep a reference to the node immediately before `slow`.
     - Advance `slow = slow.next` (1 step).
     - Advance `fast = fast.next.next` (2 steps).
   - Because `fast` moves twice as fast as `slow`, when `fast` reaches the end of the list (either `null` for even length or the terminal node for odd length), `slow` lands precisely on the $\lfloor n / 2 \rfloor$-th node, and `prev` points to the $(\lfloor n / 2 \rfloor - 1)$-th node.
3. **Bypass the Middle Node**:
   - Relink the predecessor directly to the successor of `slow`: `prev.next = slow.next`.
4. **Return**: Return `head`.

## Key Concepts

- **Fast and Slow Pointers (Tortoise and Hare)**: Finding the middle of a linked list in $\mathcal{O}(n)$ time and $\mathcal{O}(1)$ space without pre-computing the total length.
- **Predecessor Tracking (`prev`)**: Maintaining a pointer one step behind `slow` allows immediate deletion of the target node without a second traversal.
- **Edge-Case Guarding**: Checking `head.next == null` prevents null pointer dereferencing when deleting the solitary head node.

## Java Solution

The complete Java implementation is available in [`DeleteTheMiddleNodeOfALinkedList.java`](./DeleteTheMiddleNodeOfALinkedList.java).

## Complexity Analysis

Let $n$ be the number of nodes in the linked list:

- **Time Complexity**: $\mathcal{O}(n)$
  - In each iteration of the `while` loop, `fast` advances by 2 nodes.
  - The loop terminates after $\lfloor n / 2 \rfloor$ steps.
  - Node deletion occurs in constant time: $\mathcal{O}(1)$.
  - Total time complexity is strictly linear: $\mathcal{O}(n)$.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - The algorithm operates entirely in-place by redirecting existing next pointers.
  - Only three reference pointers (`fast`, `slow`, `prev`) are allocated.

## Key Takeaways

- Moving two pointers at speeds $1x$ and $2x$ eliminates the need for two passes (one to count length and one to reach $\lfloor n / 2 \rfloor$).
- In singly linked lists where backward traversal is impossible, carrying a trailing pointer (`prev`) enables in-place deletion as soon as the target position is reached.
