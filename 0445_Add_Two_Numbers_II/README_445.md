# 445. Add Two Numbers II

- **Problem Number**: 445
- **Difficulty**: Medium
- **LeetCode Link**: [Add Two Numbers II](https://leetcode.com/problems/add-two-numbers-ii/)

## Problem Statement

You are given two non-empty singly linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list in the same order (most significant digit first).

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

## Approach

Because digits are given with the most significant digit first, standard right-to-left addition cannot begin at the heads directly without knowing the alignment or carries. The implementation addresses this by reversing both input lists, performing column-wise addition with a unified traversal loop, and reversing the resulting list back:

1. **Reverse Input Lists**:
   - The helper function `reverse(ListNode l)` inverts pointer directions in-place using three pointers (`prev`, `curr`, `temp`).
   - Reverse both `l1` and `l2`: `l1 = reverse(l1)` and `l2 = reverse(l2)`. The least significant digits (1's place) are now at the heads.
2. **Unified Addition Traversal**:
   - Initialize a sentinel dummy node `dummy = new ListNode(0)`, tracking pointer `curr = dummy`, and `carry = 0`.
   - Traverse while any operand has remaining digits or a carry persists:
     ```java
     while (l1 != null || l2 != null || carry != 0)
     ```
   - In each iteration:
     - Initialize `sum = carry`.
     - Add `l1.val` if `l1 != null` and advance `l1 = l1.next`.
     - Add `l2.val` if `l2 != null` and advance `l2 = l2.next`.
     - Update the next carry: `carry = sum / 10`.
     - Append a new node for the current place value: `curr.next = new ListNode(sum % 10)`.
     - Advance `curr = curr.next`.
3. **Restore Digit Order**:
   - The resulting list currently has least significant digits first. Reverse the result list (`dummy.next`) using `reverse(dummy.next)`.
4. **Return**: Return `reverse(dummy.next)`.

## Key Concepts

- **In-Place Linked List Reversal**: Three-pointer manipulation (`prev`, `curr`, `temp`) allows reversing direction without auxiliary node allocations.
- **Unified Carry & Traversal Condition**: Combining `l1 != null || l2 != null || carry != 0` into a single loop handles unequal list lengths and the final carry overflow in one clean pass.
- **Sentinel / Dummy Node**: Simplifies dynamic list construction by avoiding conditional checks for allocating the list head.

## Java Solution

The complete Java implementation is available in [`AddTwoNumbersII.java`](./AddTwoNumbersII.java).

## Complexity Analysis

Let $m$ and $n$ be the lengths of lists `l1` and `l2` respectively:

- **Time Complexity**: $\mathcal{O}(\max(m, n))$
  - Reversing `l1` takes $\mathcal{O}(m)$ operations and reversing `l2` takes $\mathcal{O}(n)$ operations.
  - The addition loop runs $\max(m, n) + 1$ times in the worst case (if a final carry occurs).
  - Reversing the result list of length $\le \max(m, n) + 1$ takes $\mathcal{O}(\max(m, n))$ operations.
  - Overall time complexity is $\mathcal{O}(\max(m, n))$.

- **Auxiliary Space Complexity**: $\mathcal{O}(\max(m, n))$
  - A new linked list containing at most $\max(m, n) + 1$ nodes is allocated to store the sum.
  - The in-place reversals and scalar variables (`sum`, `carry`, pointers) use $\mathcal{O}(1)$ auxiliary space.

## Key Takeaways

- Reversing singly linked lists aligns the place values from least significant to most significant digit, reducing the problem to the standard [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) algorithm.
- Consolidating the traversal loop into `while (l1 != null || l2 != null || carry != 0)` eliminates redundant trailing loops and prevents unreset carry bugs.
