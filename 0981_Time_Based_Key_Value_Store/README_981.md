# 981. Time Based Key-Value Store

- **Problem Number**: 981
- **Difficulty**: Medium
- **LeetCode Link**: [Time Based Key-Value Store](https://leetcode.com/problems/time-based-key-value-store/)

## Problem Statement

Design a time-based key-value data structure that can store multiple values for the same key at different timestamps and retrieve the key's value at a certain timestamp.

Implement the `TimeMap` class:
- `TimeMap()`: Initializes the structure.
- `void set(String key, String value, int timestamp)`: Stores the key `key` with the value `value` at the given time `timestamp`.
- `String get(String key, int timestamp)`: Returns a value such that `set` was previously called on it, with `timestamp_prev <= timestamp`. If there are multiple such values, it returns the value associated with the largest `timestamp_prev`. If there are no values, it returns `""`.

## Approach

The implementation models the structure using a combination of a hash table and self-balancing binary search trees:

1. **Composite Data Structure**:
   - Use `HashMap<String, TreeMap<Integer, String>> map`.
   - The outer `HashMap` maps each string key to its personal timeline.
   - The inner `TreeMap` maps each integer timestamp to its corresponding value string, keeping timestamps sorted in ascending order via a Red-Black Tree.
2. **`set(key, value, timestamp)` Operation**:
   - Call `map.putIfAbsent(key, new TreeMap<>())` to ensure a timeline exists for the given key.
   - Insert the timestamp-value pair into the key's tree map: `map.get(key).put(timestamp, value)`.
3. **`get(key, timestamp)` Operation**:
   - If `key` is not present in the outer hash map (`!map.containsKey(key)`), return `""`.
   - Query the key's `TreeMap` using `floorEntry(timestamp)`. The `floorEntry` method retrieves the greatest key less than or equal to the given timestamp, matching the requirement for the largest `timestamp_prev <= timestamp` in $\mathcal{O}(\log K)$ time.
   - If no such entry exists (`entry == null`, meaning all recorded timestamps for this key are strictly greater than `timestamp`), return `""`.
   - Otherwise, return `entry.getValue()`.

## Key Concepts

- **Hash Map + Ordered Map Composition**: Combining `HashMap` for $\mathcal{O}(1)$ average key lookups with `TreeMap` for logarithmic range/floor queries.
- **Red-Black Tree Floor Queries**: Utilizing `TreeMap.floorEntry(timestamp)` to locate the greatest key $\le$ target timestamp.
- **Data Structure Design**: Managing nested collections to represent multi-dimensional or time-series data.

## Java Solution

The complete Java implementation is available in [`TimeBasedKeyValueStore.java`](./TimeBasedKeyValueStore.java).

## Complexity Analysis

Let $N$ be the total number of `set` calls, $M$ be the total number of `get` calls, and $K$ be the number of timestamps associated with a specific key ($K \le N$):

- **Time Complexity**:
  - `set`: $\mathcal{O}(\log K)$ on average.
    - Looking up the key in the `HashMap` takes $\mathcal{O}(L)$ where $L$ is key string length.
    - Inserting into `TreeMap` takes $\mathcal{O}(\log K)$ to balance the Red-Black Tree.
  - `get`: $\mathcal{O}(\log K)$ on average.
    - Checking and retrieving the key from the `HashMap` takes $\mathcal{O}(L)$.
    - `floorEntry(timestamp)` traverses the `TreeMap` in $\mathcal{O}(\log K)$ time.

- **Auxiliary Space Complexity**: $\mathcal{O}(N)$
  - Storing all $N$ entries across the nested maps requires space proportional to the total number of stored `(key, value, timestamp)` triples.

## Key Takeaways

- A `TreeMap` naturally supports predecessor (`floorEntry`) and successor (`ceilingEntry`) queries in $\mathcal{O}(\log K)$ time, making it suitable for timestamp-based point-in-time lookups.
- Nesting an ordered map within a hash map provides a modular architecture for managing independent time-series histories per key.
