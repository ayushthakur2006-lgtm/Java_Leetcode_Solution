# 68. Text Justification

- **Problem Number**: 68
- **Difficulty**: Hard
- **LeetCode Link**: [Text Justification](https://leetcode.com/problems/text-justification/)

## Problem Statement

Given an array of strings words and a width maxWidth , format the text such that each line has exactly maxWidth characters and is fully (left and right) justified. You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces &#39; &#39; when necessary so that each line has exactly maxWidth characters. Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line does not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right. For the last line of text, it should be left-justified, and no extra space is inserted between words. Note: A word is defined as a character sequence consisting of non-space characters only. Each word&#39;s length is guaranteed to be greater than 0 and not exceed maxWidth . The input array words contains at least one word.

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `fullJustify(String[] words, int maxWidth) -> List<String>`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `fullJustify(String[] words, int maxWidth) -> List<String>`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Dynamic Array (`ArrayList`/`List`)
- **Data Structure**: String Builder (`StringBuilder`)
- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`TextJustification.java`](./TextJustification.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n^2)$
  - Nested loops iterate over element pairs.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
