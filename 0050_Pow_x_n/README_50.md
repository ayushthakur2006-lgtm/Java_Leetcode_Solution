# 50. Pow(x, n)

- **Problem Number**: 50
- **Difficulty**: Medium
- **LeetCode Link**: [Pow(x, n)](https://leetcode.com/problems/powx-n/)

## Problem Statement

Implement `pow(x, n)`, which calculates $x$ raised to the power $n$ ($x^n$). The exponent $n$ can be positive, negative, or zero.

## Approach

The implementation uses **binary exponentiation** (exponentiation by squaring) to compute powers in logarithmic time:

1. **64-Bit Exponent Conversion**:
   - Cast the 32-bit signed integer `n` to a 64-bit integer `long power = n`.
   - If `power < 0`, negate it (`power = -power`). Using `long` avoids 32-bit integer overflow when $n = -2^{31}$ (`Integer.MIN_VALUE`), whose negation would exceed `Integer.MAX_VALUE`.
2. **Binary Exponentiation Loop**:
   - Initialize `double ans = 1.0`.
   - While `power > 0`:
     - If `power % 2 == 1` (the lowest bit is set), multiply `ans` by the current base `x`.
     - Square the base `x = x * x`.
     - Halve the exponent `power = power / 2`.
3. **Negative Exponent Inversion**:
   - If the original exponent `n` was negative, invert the computed product: `ans = 1.0 / ans`.
4. **Return**: Return `ans`.

## Key Concepts

- **Binary Exponentiation / Exponentiation by Squaring**: Dividing the exponent by 2 while squaring the base reduces an $\mathcal{O}(n)$ linear calculation to $\mathcal{O}(\log n)$.
- **Integer Overflow Protection**: Promoting 32-bit signed integers to `long` prevents underflow when negating `Integer.MIN_VALUE` ($-2^{31}$).
- **Modular Parity Check**: Using `power % 2 == 1` to selectively apply multipliers according to the binary representation of the exponent.

## Java Solution

The complete Java implementation is available in [`PowXN.java`](./PowXN.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(\log |n|)$
  - In each iteration of the `while` loop, `power` is divided by 2.
  - The loop executes at most $\lfloor \log_2 |n| \rfloor + 1$ times.
  - Each step consists of constant-time $\mathcal{O}(1)$ multiplications and divisions.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - The algorithm executes iteratively without recursion, requiring only a constant number of scalar variables (`power`, `ans`, `x`).

## Key Takeaways

- Direct linear multiplication $\mathcal{O}(|n|)$ times out for large exponents up to $2^{31} - 1$; exponentiation by squaring achieves an exponential speedup down to $\mathcal{O}(\log |n|)$.
- Signed integer limits are asymmetrical: `-Integer.MIN_VALUE` cannot be represented in a 32-bit signed `int`. Casting to `long` before negation is a critical safeguard.
