# 6. Zigzag Conversion

- **Problem Number**: 6
- **Difficulty**: Medium
- **LeetCode Link**: [Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/)

## Problem Statement

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility) P A H N A P L S I I G Y I R And then read line by line: "PAHNAPLSIIGYIR" Write the code that will take a string and make this conversion given a number of rows: string convert(string s, int numRows);

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `convert(String s, int numRows) -> String`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `convert(String s, int numRows) -> String`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Dynamic Array (`ArrayList`/`List`)
- **Data Structure**: String Builder (`StringBuilder`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`ZigzagConversion.java`](./ZigzagConversion.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n^2)$
  - Nested loops iterate over element pairs.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
