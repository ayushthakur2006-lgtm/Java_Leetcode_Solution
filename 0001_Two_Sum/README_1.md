# 1. Two Sum

- **Problem Number**: 1
- **Difficulty**: Easy
- **LeetCode Link**: [Two Sum](https://leetcode.com/problems/two-sum/)

## Problem Statement

Given an array of integers `nums` and an integer `target`, find two distinct elements in the array that sum up to `target` and return their indices. It is assumed that each input has exactly one valid solution, and the same element cannot be used twice.

## Approach

The implementation uses an `ArrayList`-based complement search:

1. **Copy elements to a List**: Transfer all elements from the primitive array `nums` into an `ArrayList<Integer>` (`temp1`) of size $n$.
2. **Iterate and calculate complement**: Iterate through `nums` using index `j`. For each element `nums[j]`, compute the required complement `x = target - nums[j]`.
3. **Search for complement**:
   - Check if `temp1` contains `x` using `temp1.contains(x)`.
   - If found, retrieve the index `y` of the first occurrence of `x` using `temp1.indexOf(x)`.
   - Check whether `j == y`. If both indices are equal, the element found is the current element itself, so skip to the next iteration.
4. **Collect answer**: If `j != y`, assign `answer[0] = j` and `answer[1] = y`, then break out of the loop.
5. **Return**: Return the 2-element array `answer`.

> **Note on duplicate handling**: `ArrayList.indexOf(x)` always returns the index of the first occurrence of `x`. If the answer comprises two identical values (e.g., `nums = [3, 3]` and `target = 6`), at `j = 0`, `y` is `0`, causing the algorithm to skip via `continue`. When the loop reaches `j = 1`, `indexOf(3)` returns `0`, yielding `j != y` and correctly finding `[1, 0]`.

## Key Concepts

- **Linear Data Structures**: Array (`int[]`), Dynamic Array (`ArrayList<Integer>`)
- **Search Operations**: Sequential search (`List.contains()`, `List.indexOf()`)
- **Complement Lookup**: Reducing a two-variable equation ($a + b = \text{target}$) to a search problem ($b = \text{target} - a$)

## Java Solution

The complete Java implementation is available in [`TwoSum.java`](./TwoSum.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n^2)$
  - Transferring elements from `nums` to `temp1` takes $\mathcal{O}(n)$ time.
  - The outer loop runs at most $n$ iterations.
  - Inside the loop, both `temp1.contains(x)` and `temp1.indexOf(x)` perform linear scans over the `ArrayList` of size $n$, each taking $\mathcal{O}(n)$ time in the worst case.
  - Consequently, the total time complexity is $\mathcal{O}(n) + \mathcal{O}(n \cdot n) = \mathcal{O}(n^2)$.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - An `ArrayList<Integer>` of size $n$ is allocated to hold the boxed elements of the input array.
  - The returned `answer` array uses $\mathcal{O}(1)$ auxiliary space.

## Key Takeaways

- Searching via complement (`target - nums[j]`) eliminates the need for nested explicit loops, but list lookup methods (`contains`, `indexOf`) still execute linear scans under the hood.
- Using an `ArrayList` keeps the lookup cost at $\mathcal{O}(n)$, yielding an overall $\mathcal{O}(n^2)$ runtime. Transitioning to a hash-based lookup structure (e.g., `HashMap`) allows average $\mathcal{O}(1)$ lookups, optimizing the time complexity to $\mathcal{O}(n)$.
