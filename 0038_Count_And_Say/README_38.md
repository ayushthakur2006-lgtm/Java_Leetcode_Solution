# 38. Count and Say

- **Problem Number**: 38
- **Difficulty**: Medium
- **LeetCode Link**: [Count and Say](https://leetcode.com/problems/count-and-say/)

## Problem Statement

The count-and-say sequence is a sequence of digit strings defined by the recursive formula: countAndSay(1) = "1" countAndSay(n) is the run-length encoding of countAndSay(n - 1) . Run-length encoding (RLE) is a string compression method that works by replacing each maximal group of consecutive identical characters with the concatenation of the length of the group followed by the character itself. For example, to compress the string "3322251" we replace "33" with "23" , replace "222" with "32" , replace "5" with "15" , and replace "1" with "11" . Thus the compressed string becomes "23321511" . Given a positive integer n , return the n th element of the count-and-say sequence .

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `countAndSay(int n) -> String`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `countAndSay(int n) -> String`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: String Builder (`StringBuilder`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`CountAndSay.java`](./CountAndSay.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
