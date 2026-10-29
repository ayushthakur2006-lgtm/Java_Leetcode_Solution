# 12. Integer to Roman

- **Problem Number**: 12
- **Difficulty**: Medium
- **LeetCode Link**: [Integer to Roman](https://leetcode.com/problems/integer-to-roman/)

## Problem Statement

Seven different symbols represent Roman numerals with the following values: Symbol Value I 1 V 5 X 10 L 50 C 100 D 500 M 1000 Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules: If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral. If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, for example, 4 is 1 ( I ) less than 5 ( V ): IV and 9 is 1 ( I ) less than 10 ( X ): IX . Only the following subtractive forms are used: 4 ( IV ), 9 ( IX ), 40 ( XL ), 90 ( XC ), 400 ( CD ) and 900 ( CM ). Only powers of 10 ( I , X , C , M ) can be appended consecutively at most 3 times to represent multiples of 10. You cannot append 5 ( V ), 50 ( L ), or 500 ( D ) multiple times. If you need to append a symbol 4 times use the subtractive form . Given an integer, convert it to a Roman numeral.

## Approach

The implementation uses **Direct Iterative Traversal / Simulation** inside `intToRoman(int num) -> String`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `intToRoman(int num) -> String`.
2. **Core Traversal**: Apply **Direct Iterative Traversal / Simulation** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Hash Map (`HashMap`)
- **Data Structure**: String Builder (`StringBuilder`)
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`IntegerToRoman.java`](./IntegerToRoman.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **direct iterative traversal / simulation** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
