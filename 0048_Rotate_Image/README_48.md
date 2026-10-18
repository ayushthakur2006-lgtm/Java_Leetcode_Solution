# 48. Rotate Image

- **Problem Number**: 48
- **Difficulty**: Medium
- **LeetCode Link**: [Rotate Image](https://leetcode.com/problems/rotate-image/)

## Problem Statement

You are given an $n \times n$ 2D matrix representing an image. Rotate the image by 90 degrees clockwise in-place, meaning you must modify the input 2D matrix directly without allocating another 2D matrix.

## Approach

The implementation intends to execute the standard two-step matrix transformation: transpose the matrix across the main diagonal, then horizontally reverse each row.

1. **Transpose Attempt**:
   - Iterate through each cell `(row, col)` and swap `matrix[row][col]` with `matrix[col][row]`.
2. **Row Inversion**:
   - Iterate through each row in `matrix` and invoke the helper method `reverse(int[] nums)`.
   - The helper function uses two pointers (`first` and `second`) starting at opposite ends of the row, swapping elements when they differ until the pointers meet in the middle.

## Known Error / Implementation Limitation

> [!WARNING]
> **Full-Grid Iteration Reverts Transposition (Double-Swap Bug)**
> 
> In lines 23–31 of [`RotateImage.java`](./RotateImage.java), the transpose loop is written as:
> ```java
> for (int row = 0; row < matrix.length; row++) {
>     for (int col = 0; col < matrix[0].length; col++) {
>         int temp = matrix[row][col];
>         matrix[row][col] = matrix[col][row];
>         matrix[col][row] = temp;
>     }
> }
> ```
> 
> - **Actual Behavior**: The inner loop variable `col` iterates through the full width of the row (`0` to `matrix[0].length - 1`) instead of starting from `row + 1`. Consequently, each pair of off-diagonal elements `(row, col)` and `(col, row)` is swapped twice:
>   - When `row = 0, col = 1`, `matrix[0][1]` and `matrix[1][0]` are swapped.
>   - Later, when `row = 1, col = 0`, `matrix[1][0]` and `matrix[0][1]` are swapped again, restoring their original positions.
>   - Because every swap is undone, the matrix remains un-transposed.
>   - The subsequent row reversal step (`reverse(rows)`) then merely mirrors the original matrix horizontally, resulting in a horizontal reflection rather than a $90^\circ$ clockwise rotation.
> - **Intended Fix**: Limit the inner loop to the upper triangle of the matrix by starting at `col = row + 1` (or `col = row`):
>   ```java
>   for (int row = 0; row < matrix.length; row++) {
>       for (int col = row + 1; col < matrix[0].length; col++) {
>           int temp = matrix[row][col];
>           matrix[row][col] = matrix[col][row];
>           matrix[col][row] = temp;
>       }
>   }
>   ```

## Key Concepts

- **2D Matrix Manipulation**: In-place coordinate transformation without secondary grid buffers.
- **Matrix Transposition**: Swapping elements across the main diagonal (`matrix[i][j]` with `matrix[j][i]`).
- **Two Pointers**: Reversing 1D arrays in-place by moving boundaries inward from both ends.
- **Linear Algebra Symmetry**: A 90-degree clockwise rotation decomposes into a transpose followed by a horizontal reflection.

## Java Solution

The complete Java implementation is available in [`RotateImage.java`](./RotateImage.java).

## Complexity Analysis

Let $n$ be the number of rows and columns in the $n \times n$ matrix:

- **Time Complexity**: $\mathcal{O}(n^2)$
  - The nested transpose loops iterate $n \times n = n^2$ times, performing constant-time $\mathcal{O}(1)$ swaps.
  - Reversing each of the $n$ rows of length $n$ takes $n \times \mathcal{O}(n) = \mathcal{O}(n^2)$ operations.
  - Total time complexity is $\mathcal{O}(n^2)$.

- **Auxiliary Space Complexity**: $\mathcal{O}(1)$
  - All modifications are performed in-place on the input matrix.
  - Only scalar variables (`row`, `col`, `temp`, `first`, `second`) are used, requiring constant $\mathcal{O}(1)$ auxiliary space.

## Key Takeaways

- A 90-degree clockwise rotation is mathematically equivalent to transposing the matrix along the main diagonal and reversing each row.
- When transposing a matrix in-place, the inner loop must strictly traverse only one triangle (e.g., `col = row + 1` to `n - 1`). Traversing the full matrix swaps each pair twice, cancelling the transformation entirely.
