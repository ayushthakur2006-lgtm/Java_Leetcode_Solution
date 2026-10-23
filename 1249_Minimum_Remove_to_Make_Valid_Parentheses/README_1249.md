# 1249. Minimum Remove to Make Valid Parentheses

- **Problem Number**: 1249
- **Difficulty**: Medium
- **LeetCode Link**: [Minimum Remove to Make Valid Parentheses](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/)

## Problem Statement

Given a string s of &#39;(&#39; , &#39;)&#39; and lowercase English characters. Your task is to remove the minimum number of parentheses ( &#39;(&#39; or &#39;)&#39; , in any positions ) so that the resulting parentheses string is valid and return any valid string. Formally, a parentheses string is valid if and only if: It is the empty string, contains only lowercase characters, or It can be written as AB ( A concatenated with B ), where A and B are valid strings, or It can be written as (A) , where A is a valid string.

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `minRemoveToMakeValid(String s) -> String`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `minRemoveToMakeValid(String s) -> String`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Dynamic Array (`ArrayList`/`List`)
- **Data Structure**: String Builder (`StringBuilder`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`MinimumRemoveToMakeValidParentheses.java`](./MinimumRemoveToMakeValidParentheses.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
