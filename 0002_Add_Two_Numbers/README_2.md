# 2. Add Two Numbers

- **Problem Number**: 2
- **Difficulty**: Medium
- **LeetCode Link**: [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)

## Problem Statement

You are given two non-empty singly linked lists representing two non-negative integers. The digits are stored in reverse order, meaning that each node contains a single digit and the 1's place value is at the head of the list. Add the two numbers and return the sum as a linked list, also in reverse order.

## Approach

The implementation simulates column-wise addition from the least significant digit to the most significant digit using linked list pointers and a carry tracker:

1. **Dummy Head Initialization**: Initialize a dummy head node `answer = new ListNode(0)` and a tracking pointer `Current = answer`. Initialize tracking variables `temp`, `carry`, and `vary` to `0`.
2. **Synchronous Two-List Traversal**:
   - Traverse both lists concurrently using `Curr` (for `l1`) and `Curr_` (for `l2`) while both pointers are not `null`.
   - Compute the sum of current digits plus previous carry: `temp = Curr.val + Curr_.val + carry`.
   - If `temp >= 10`:
     - Set the new node's value to the last digit: `vary % 10`.
     - Update `carry` using integer division: `(vary - (vary % 10)) / 10`.
   - If `temp < 10`:
     - Set the new node's value to `temp`.
     - Reset `carry = 0`.
   - Append the created node to `Current.next`, advance `Current`, and move both `Curr` and `Curr_` forward.
3. **Handling Remaining Nodes**:
   - **`l2` has remaining nodes (`Curr == null && Curr_ != null`)**: Continue traversing `Curr_`, adding `Curr_.val + carry`. If carry remains after the loop, create and append a final node with `carry`.
   - **`l1` has remaining nodes (`Curr_ == null && Curr != null`)**: Continue traversing `Curr`, adding `Curr.val + carry`. If carry remains after the loop, create and append a final node with `carry`.
   - **Equal-length lists (`else`)**: If both lists terminate simultaneously and `carry > 0`, append an extra node containing `carry`.
4. **Return Result**: Return `answer.next`, bypassing the dummy head.

> **Implementation Note / Limitation**: In the secondary loops handling remaining nodes of a single list, when `(temp + carry) < 10`, `carry` is added to the node value but is not explicitly reset to `0`. If a carry is carried into these branches, it will be repeatedly added to subsequent digits until an addition yields $\ge 10$ or the list ends. To ensure complete correctness across all inputs where remaining nodes exist, `carry` should be reset to `0` whenever `(temp + carry) < 10`.

## Key Concepts

- **Singly Linked Lists**: Dynamic node linking via `ListNode` and pointer traversal (`next`).
- **Sentinel / Dummy Node**: Using a dummy node (`answer`) to anchor the head and avoid special-case branching for list creation.
- **Elementary Addition Simulation**: Digit-by-digit addition with carry propagation using modulo (`% 10`) and division (`/ 10`).
- **Multi-phase Traversal**: Processing equal-length prefixes first, followed by independent handling of uneven trailing nodes.

## Java Solution

The complete Java implementation is available in [`AddTwoNumbers.java`](./AddTwoNumbers.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(\max(m, n))$
  - Let $m$ be the number of nodes in `l1` and $n$ be the number of nodes in `l2`.
  - The first `while` loop runs $\min(m, n)$ times.
  - The subsequent loops process the remaining $|m - n|$ nodes of whichever list is longer.
  - Each node takes constant $\mathcal{O}(1)$ operations (addition, modulo, division, node instantiation).
  - Therefore, the total time complexity is $\mathcal{O}(\max(m, n))$.

- **Auxiliary Space Complexity**: $\mathcal{O}(\max(m, n))$
  - A new linked list is constructed to store the result, containing at most $\max(m, n) + 1$ nodes.
  - Excluding the required output list, the auxiliary space used is $\mathcal{O}(1)$ for scalar variables (`temp`, `carry`, `vary`) and pointer references.

## Key Takeaways

- A dummy head node simplifies linked list construction by removing conditional checks for initializing the head vs. appending subsequent nodes.
- Simulating elementary school column-wise addition naturally aligns with reverse-order linked lists, as traversal moves directly from the least significant digit to the most significant digit.
- While multi-phase loops separate the logic for shared and remaining segments, consolidating the traversal into a single unified condition (`while (l1 != null || l2 != null || carry != 0)`) can reduce code duplication and eliminate state-reset bugs like unreset carry values.
