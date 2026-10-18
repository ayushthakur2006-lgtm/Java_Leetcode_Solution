# 6. Zigzag Conversion

- **Problem Number**: 6
- **Difficulty**: Medium
- **LeetCode Link**: [Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/)

## Problem Statement

The string is written in a zigzag pattern on a given number of rows (`numRows`), moving vertically down and diagonally up in an alternating fashion, and then read line by line. Given a string `s` and an integer `numRows`, return the string formed by reading the characters row by row.

## Approach

The implementation simulates the zigzag motion row-by-row by distributing characters into buckets corresponding to each row and toggling directions at the top and bottom boundaries:

1. **Base Case Optimization**:
   - If `numRows == 1` or `numRows >= s.length()`, the zigzag pattern either has only one row or cannot complete a single column. Return the original string `s` directly.
2. **Row Bucket Initialization**:
   - Allocate an array of character lists `List<Character>[] twoDStructure` of size `numRows`.
   - Instantiate an empty `ArrayList<Character>` for each row to collect its respective characters.
3. **Simulating Zigzag Traversal**:
   - Track the current row with `index = 0` and the vertical movement with `direction = 1` (`+1` for downward movement, `-1` for upward diagonal movement).
   - Iterate through each character `temp` of `s`:
     - Add `temp` to `twoDStructure[index]`.
     - **Boundary Checking & Direction Reversal**:
       - If `index == 0`, set `direction = 1` (move downwards).
       - Else if `index == numRows - 1`, set `direction = -1` (move upwards).
     - Update the row cursor: `index += direction`.
4. **Row-by-Row Result Construction**:
   - Traverse through each row in `twoDStructure` and append its characters sequentially into a `StringBuilder sb`.
5. **Return**: Convert `sb` to a string and return it.

## Key Concepts

- **Array of Dynamic Lists**: `List<Character>[]` using `ArrayList` per row to group characters without precalculating exact column widths.
- **Direction Toggle Pattern**: Using a signed increment (`direction = 1` or `-1`) to alternate trajectory at boundary rows (`0` and `numRows - 1`).
- **Boundary Guarding**: Early return when `numRows == 1` or `numRows >= s.length()`, eliminating edge-case index bounds violations.
- **String Building**: `StringBuilder` for linear-time character aggregation.

## Java Solution

The complete Java implementation is available in [`ZigzagConversion.java`](./ZigzagConversion.java).

## Complexity Analysis

Let $|s|$ be the length of the input string and `numRows` be the number of rows:

- **Time Complexity**: $\mathcal{O}(|s| + \text{numRows})$
  - Initializing `numRows` lists takes $\mathcal{O}(\text{numRows})$ time.
  - Distributing $|s|$ characters across the lists runs in a single loop with $\mathcal{O}(1)$ amortized insertion per character, taking $\mathcal{O}(|s|)$ time.
  - Concatenating all characters from `twoDStructure` into `StringBuilder` takes $\mathcal{O}(|s|)$ time.
  - Overall time complexity is $\mathcal{O}(|s| + \text{numRows})$.

- **Auxiliary Space Complexity**: $\mathcal{O}(|s| + \text{numRows})$
  - Storing $|s|$ characters across the `twoDStructure` lists requires $\mathcal{O}(|s|)$ auxiliary heap space.
  - The array holding references for `numRows` lists requires $\mathcal{O}(\text{numRows})$ space.
  - The `StringBuilder` requires $\mathcal{O}(|s|)$ space to construct the final string.

## Key Takeaways

- Simulating the path of characters using a row pointer and a reversible step offset (`+1` / `-1`) eliminates complex geometric index formulas.
- Grouping characters into row-specific dynamic lists avoids allocating sparse 2D matrices that waste memory on unused zigzag cells.
