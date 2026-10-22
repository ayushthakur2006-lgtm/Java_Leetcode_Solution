# 2816. Double a Number Represented as a Linked List

- **Problem Number**: 2816
- **Difficulty**: Medium
- **LeetCode Link**: [Double a Number Represented as a Linked List](https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/)

## Problem Statement

You are given the `head` of a non-empty singly linked list representing a non-negative integer without leading zeroes. Return the `head` of the linked list after doubling the integer it represents.

## Approach

The implementation carries out elementary arithmetic multiplication by 2 by reversing the list so least significant digits appear first, performing column multiplication with carry propagation, and reversing the result back:

1. **Reverse Input List**:
   - The private helper method `reverse(ListNode l)` inverts pointer directions using a classic three-pointer traversal (`prev`, `curr`, `temp`).
   - Reverse `head` to obtain `tempListNode`, placing the 1's place value at the head of the list.
2. **Double Each Digit with Carry**:
   - Initialize `carry = 0`, a sentinel dummy node `dummy = new ListNode(0)`, and a pointer `curr = dummy`.
   - Traverse `tempListNode`:
     - Compute the doubled value plus previous carry: `value = carry + (tempListNode.val * 2)`.
     - Update carry: `carry = value / 10`.
     - Create a new node with the unit digit `value % 10` and link it: `curr.next = new ListNode(value % 10)`.
     - Advance `curr` and move `tempListNode` forward.
3. **Flush Leftover Carry**:
   - If a carry remains after the list traversal (`while (carry != 0)`), create and append new nodes for each remaining digit (`carry % 10`) and update `carry = carry / 10`.
4. **Restore Proper Order**:
   - Reverse the newly created linked list (`dummy.next`) so that most significant digits are returned at the front.
5. **Return**: Return `reverse(dummy.next)`.

## Key Concepts

- **Linked List Reversal**: Inverting pointer direction in-place allows arithmetic simulation from least significant digit to most significant digit without needing random access indexing.
- **Elementary Multiplication Simulation**: Doubling digit values, extracting unit values with modulo (`% 10`), and propagating carries using integer division (`/ 10`).
- **Dummy Node / Sentinel Pattern**: Using `dummy` simplifies appending nodes without special-casing the new list's head.

## Java Solution

The complete Java implementation is available in [`DoubleANumberRepresentedAsALinkedList.java`](./DoubleANumberRepresentedAsALinkedList.java).

## Complexity Analysis

Let $n$ be the number of nodes in the original linked list:

- **Time Complexity**: $\mathcal{O}(n)$
  - Reversing the input list takes $\mathcal{O}(n)$ time.
  - Traversing the reversed list and doubling each digit runs in $\mathcal{O}(n)$ time, as each node is visited once.
  - Flushing the carry takes at most $\mathcal{O}(1)$ since doubling a single-digit carry produces at most 1 extra digit.
  - Reversing the resulting list of length $n$ or $n + 1$ takes $\mathcal{O}(n)$ time.
  - Total time complexity is strictly linear: $\mathcal{O}(n)$.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - A new linked list containing at most $n + 1$ nodes is allocated for the result.
  - Pointer manipulation and carry variables use $\mathcal{O}(1)$ auxiliary space.

## Key Takeaways

- Operating on numbers stored as singly linked lists from most significant to least significant digit is simplified by reversing the list first to process carries naturally from least significant to most significant digit.
- Doubling each digit can generate at most a carry of 1 ($\le 9 \times 2 + 1 = 19$), so the resulting list length increases by at most one node.
