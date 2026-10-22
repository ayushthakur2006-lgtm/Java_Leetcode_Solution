# 1249. Minimum Remove to Make Valid Parentheses

- **Problem Number**: 1249
- **Difficulty**: Medium
- **LeetCode Link**: [Minimum Remove to Make Valid Parentheses](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/)

## Problem Statement

Given a string `s` of `'('`, `')'`, and lowercase English characters, remove the minimum number of parentheses (either `'('` or `')'`, in any positions) so that the resulting parentheses string is valid, and return any valid resulting string.

A parentheses string is valid if:
- It is the empty string, contains only lowercase characters, or
- It can be written as `AB` (`A` concatenated with `B`), where `A` and `B` are valid strings, or
- It can be written as `(A)`, where `A` is a valid string.

## Approach

The implementation uses an index-tracking stack (simulated with `ArrayList<Integer>`) and in-place marker replacement with a sentinel character (`*`):

1. **First Pass (Find Invalid Closing Parentheses)**:
   - Copy `s` into a mutable `StringBuilder sb`.
   - Maintain a `List<Integer> list` to store the indices of open parentheses `'('`.
   - Traverse `s` from left to right:
     - If `s.charAt(i) == '('`, add its index `i` to `list`.
     - If `s.charAt(i) == ')'`:
       - If `list.isEmpty()`, there is no preceding unmatched `'('` to pair with this closing bracket. Mark it as invalid by replacing it with `'*'` in `sb`: `sb.setCharAt(i, '*')`.
       - If `list` is not empty, pop the most recent open bracket index: `list.remove(list.size() - 1)`.
2. **Second Pass (Mark Unmatched Open Parentheses)**:
   - Any indices remaining in `list` correspond to `'('` characters that were never closed.
   - Iterate through `list` and mark each corresponding position in `sb` with `'*'`.
3. **Third Pass (Reconstruct Clean String)**:
   - Iterate through `sb` and append every character not equal to `'*'` into a new `StringBuilder ans`.
4. **Return**: Return `ans.toString()`.

## Key Concepts

- **Stack Index Tracking**: Using a list as a Last-In-First-Out (LIFO) stack to record the positions of open brackets so they can be matched or identified as excess.
- **Sentinel Marking**: Marking invalid characters in-place with a sentinel character (`*`) decouples the validation phase from the final string reconstruction phase.
- **Two-Phase Balancing**: Identifying invalid `')'` during forward traversal and unmatched `'('` after traversal completes.

## Java Solution

The complete Java implementation is available in [`MinimumRemoveToMakeValidParentheses.java`](./MinimumRemoveToMakeValidParentheses.java).

## Complexity Analysis

Let $n$ be the length of the string `s`:

- **Time Complexity**: $\mathcal{O}(n)$
  - First pass traverses $n$ characters, performing $\mathcal{O}(1)$ list and string builder operations: $\mathcal{O}(n)$.
  - Second pass marks at most $n$ leftover opening indices: $\mathcal{O}(n)$.
  - Third pass iterates over $n$ characters to filter out markers: $\mathcal{O}(n)$.
  - Total time complexity is linear: $\mathcal{O}(n)$.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - The index stack `list` holds at most $n$ integers in the worst case (e.g., all `'('`).
  - `sb` and `ans` allocate string buffers of length $\le n$.

## Key Takeaways

- Unmatched closing parentheses can be identified immediately when encountered without an available open bracket in the stack.
- Unmatched opening parentheses cannot be determined until the end of the string, which makes keeping their indices in a stack essential for post-scan removal.
- Replacing invalid characters with a sentinel marker in a mutable buffer avoids multiple costly string splicing operations.
