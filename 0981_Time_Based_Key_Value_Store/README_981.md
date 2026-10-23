# 981. Time Based Key-Value Store

- **Problem Number**: 981
- **Difficulty**: Medium
- **LeetCode Link**: [Time Based Key-Value Store](https://leetcode.com/problems/time-based-key-value-store/)

## Problem Statement

Design a time-based key-value data structure that can store multiple values for the same key at different time stamps and retrieve the key&#39;s value at a certain timestamp. Implement the TimeMap class: TimeMap() Initializes the object of the data structure. void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp . String get(String key, int timestamp) Returns a value such that set was called previously, with timestamp_prev <= timestamp . If there are multiple such values, it returns the value associated with the largest timestamp_prev . If there are no values, it returns "" .

## Approach

The implementation uses **Hash-Based Lookup / Complement Search** inside `set(String key, String value, int timestamp) -> void`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `set(String key, String value, int timestamp) -> void`.
2. **Core Traversal**: Apply **Hash-Based Lookup / Complement Search** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Hash Map (`HashMap`)
- **Data Structure**: Balanced BST (`TreeMap`/`TreeSet`)
- **Algorithm / Technique**: Hash-Based Lookup / Complement Search

## Java Solution

The complete Java implementation is available in [`TimeBasedKeyValueStore.java`](./TimeBasedKeyValueStore.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n)$
  - A single linear scan processes each element in constant amortized time.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **hash-based lookup / complement search** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
