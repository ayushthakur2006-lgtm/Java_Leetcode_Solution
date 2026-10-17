# 38. Count and Say

- **Problem Number**: 38
- **Difficulty**: Medium
- **LeetCode Link**: [Count and Say](https://leetcode.com/problems/count-and-say/)

## Problem Statement

The count-and-say sequence is a sequence of digit strings formed recursively by run-length encoding the previous term. Starting from the base case $n = 1$ defined as `"1"`, each subsequent term describes the count of contiguous matching digits followed by the digit itself from the previous term. Given an integer $n$, generate the $n$-th term of the sequence.

## Approach

The implementation combines top-down recursion to reach the base case with a two-pointer run-length encoding (RLE) scan using `StringBuilder`:

1. **Base Case**: If $n = 1$, return `"1"`.
2. **Recursive Descent**: Call `countAndSay(n - 1)` to obtain `prev`, the string representation of the $(n - 1)$-th term.
3. **Run-Length Encoding via Two Pointers**:
   - Initialize a `StringBuilder sb`, a frequency counter `count = 0`, and two pointer indices `first = 0` and `second = 0`.
   - Traverse `prev` while `second < prev.length()`:
     - **Matching Digits (`prev.charAt(first) == prev.charAt(second)`)**: Advance `second` by 1 and increment `count` by 1 to extend the current contiguous run.
     - **Run Transition (`else`)**: When a different character is encountered:
       - Update `first = second` to designate the start of the next run.
       - Append the accumulated `count` to `sb`.
       - Append the digit of the finished run (`prev.charAt(first - 1)`) to `sb`.
       - Reset `count = 0`. Note that `second` remains at its current position so this new character begins its count on the next iteration.
4. **Flushing the Trailing Run**:
   - After the loop terminates, the final contiguous run's frequency is held in `count`.
   - Append `count` followed by the trailing digit `prev.charAt(second - 1)` to `sb`.
5. **Return**: Convert `sb` to a string and return it.

## Key Concepts

- **Recursion**: Top-down decomposition reducing the problem to the base case $n = 1$.
- **Two Pointers**: Index pointers `first` and `second` mark and track the boundaries of contiguous matching digit clusters.
- **Run-Length Encoding (RLE)**: Compressing sequential duplicate characters into `(frequency, character)` pairs.
- **String Construction**: Using `StringBuilder` for amortized $\mathcal{O}(1)$ append operations, avoiding quadratic memory reallocation.

## Java Solution

The complete Java implementation is available in [`Problem_38.java`](./Problem_38.java).

## Complexity Analysis

Let $L_k$ denote the length of the string at step $k$:

- **Time Complexity**: $\mathcal{O}(L_n)$
  - Generating term $k$ requires a single linear scan over `prev` of length $L_{k-1}$.
  - The length of count-and-say strings grows by a factor of Conway's constant ($\lambda \approx 1.3035$) per step.
  - Across all $n$ recursive steps, the total time is $\sum_{k=1}^{n} \mathcal{O}(L_k) = \mathcal{O}(L_n)$, which is bounded by $\mathcal{O}(2^n)$ in the worst case.

- **Auxiliary Space Complexity**: $\mathcal{O}(L_n + n)$
  - **Recursion Call Stack**: The recursion reaches depth $n$, contributing $\mathcal{O}(n)$ auxiliary space.
  - **Heap Memory**: At each level $k$, `prev` and `sb` allocate memory proportional to the string length, with the final result requiring $\mathcal{O}(L_n)$ space.

## Key Takeaways

- Two-pointer sliding windows effectively identify and measure contiguous blocks of identical characters in a single linear pass.
- In two-pointer run-length encoding, keeping the second pointer in place during a mismatch allows seamless transition to counting the next group without skipping elements.
- When traversing sequential data, ensuring that the remaining state after loop termination (the final run) is properly flushed guarantees that trailing segments are completely accounted for.
