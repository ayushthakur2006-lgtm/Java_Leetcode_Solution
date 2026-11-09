# 49. Group Anagrams

- **Problem Number**: 49
- **Difficulty**: Medium
- **LeetCode Link**: [Group Anagrams](https://leetcode.com/problems/group-anagrams/)

## Problem Statement

Given an array of strings strs , group the anagrams together. You can return the answer in any order .

## Approach

The implementation uses **Hash-Based Lookup / Complement Search** inside `groupAnagrams(String[] strs) -> List<List<String>>`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `groupAnagrams(String[] strs) -> List<List<String>>`.
2. **Core Traversal**: Apply **Hash-Based Lookup / Complement Search** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Hash Map (`HashMap`)
- **Data Structure**: Dynamic Array (`ArrayList`/`List`)
- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Hash-Based Lookup / Complement Search

## Java Solution

The complete Java implementation is available in [`GroupAnagrams.java`](./GroupAnagrams.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n^2)$
  - Nested loops iterate over element pairs.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **hash-based lookup / complement search** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
