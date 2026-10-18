# 43. Multiply Strings

- **Problem Number**: 43
- **Difficulty**: Medium
- **LeetCode Link**: [Multiply Strings](https://leetcode.com/problems/multiply-strings/)

## Problem Statement

Given two non-negative integers represented as strings `num1` and `num2`, return the product of `num1` and `num2`, also represented as a string. The solution must not use any built-in `BigInteger` libraries or convert the inputs to integers directly.

## Approach

The implementation simulates manual grade-school multiplication using an array to accumulate intermediate products and propagate carries:

1. **Zero Check**:
   - If either `num1` or `num2` is `"0"`, return `"0"` immediately to avoid unnecessary processing and handle edge cases cleanly.
2. **Buffer Allocation**:
   - Let $n$ and $m$ be the lengths of `num1` and `num2`, respectively.
   - The product of two numbers of lengths $n$ and $m$ has at most $n + m$ digits.
   - Allocate an integer array `result` of size $n + m$ initialized to zeros.
3. **Digit-by-Digit Multiplication (Right to Left)**:
   - Iterate through `num1` from index $n - 1$ down to $0$ with index `i`.
   - Iterate through `num2` from index $m - 1$ down to $0$ with index `j`.
   - Convert character digits to integers: `digit1 = num1.charAt(i) - '0'` and `digit2 = num2.charAt(j) - '0'`.
   - The product of digits at positions `i` and `j` maps to index positions `i + j` (carry position) and `i + j + 1` (units position).
   - Compute `product = digit1 * digit2 + result[i + j + 1]`.
   - Set `result[i + j + 1] = product % 10` and add the carry to `result[i + j] += product / 10`.
4. **Result String Construction**:
   - Traverse `result` and append digits to a `StringBuilder sb`.
   - Skip leading zeros using the condition `sb.length() > 0 || digit != 0`.
5. **Return**: Convert `sb` to a string and return it.

## Key Concepts

- **Arbitrary-Precision Arithmetic**: Simulating long multiplication manually when values exceed standard 64-bit primitive integer limits (`long`).
- **Array Index Mapping**: Direct positioning of partial products at indices `i + j` and `i + j + 1`.
- **Carry Propagation**: Storing units via `% 10` and accumulating tens via `/ 10` in place.
- **String Construction**: `StringBuilder` for efficient character appending while stripping leading zeros.

## Java Solution

The complete Java implementation is available in [`MultiplyStrings.java`](./MultiplyStrings.java).

## Complexity Analysis

Let $n$ be the length of `num1` and $m$ be the length of `num2`:

- **Time Complexity**: $\mathcal{O}(n \cdot m)$
  - The nested loops execute $n \times m$ iterations.
  - Each iteration involves constant-time $\mathcal{O}(1)$ arithmetic and array lookups.
  - Constructing the final string takes $\mathcal{O}(n + m)$ time.
  - Overall time complexity is $\mathcal{O}(n \cdot m)$.

- **Auxiliary Space Complexity**: $\mathcal{O}(n + m)$
  - An integer array `result` of size $n + m$ stores the intermediate digit sums.
  - The `StringBuilder` requires $\mathcal{O}(n + m)$ space for the final result string.

## Key Takeaways

- Two numbers of lengths $n$ and $m$ will always produce a product with length between $n + m - 1$ and $n + m$ digits.
- Mapping the product of `num1[i]` and `num2[j]` directly to indices `i + j` and `i + j + 1` avoids managing separate partial product rows and adding them in subsequent passes.
