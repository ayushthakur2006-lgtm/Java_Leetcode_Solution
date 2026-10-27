# 8. String to Integer (atoi)

- **Problem Number**: 8
- **Difficulty**: Medium
- **LeetCode Link**: [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/)

## Problem Statement

Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer. The algorithm for myAtoi(string s) is as follows: Whitespace : Ignore any leading whitespace ( " " ). Signedness : Determine the sign by checking if the next character is &#39;-&#39; or &#39;+&#39; , assuming positivity if neither present. Conversion : Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0. Rounding : If the integer is out of the 32-bit signed integer range [-2 31 , 2 31 - 1] , then round the integer to remain in the range. Specifically, integers less than -2 31 should be rounded to -2 31 , and integers greater than 2 31 - 1 should be rounded to 2 31 - 1 . Return the integer as the final result. Note: ​​​​​​​ You must not use any built-in library function that converts a string to a number (for example, atoi , stoi , Integer.parseInt , int() , parseInt , Number() ). Perform the conversion manually.

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `myAtoi(String s) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `myAtoi(String s) -> int`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: String Builder (`StringBuilder`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`StringToIntegerAtoi.java`](./StringToIntegerAtoi.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - Only a constant number of scalar pointer variables are used.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
