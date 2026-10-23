# 853. Car Fleet

- **Problem Number**: 853
- **Difficulty**: Medium
- **LeetCode Link**: [Car Fleet](https://leetcode.com/problems/car-fleet/)

## Problem Statement

There are n cars at given miles away from the starting mile 0, traveling to reach the mile target . You are given two integer arrays position and speed , both of length n , where position[i] is the starting mile of the i th car and speed[i] is the speed of the i th car in miles per hour. A car cannot pass another car, but it can catch up and then travel next to it at the speed of the slower car. A car fleet is a single car or a group of cars driving next to each other. The speed of the car fleet is the minimum speed of any car in the fleet. If a car catches up to a car fleet at the mile target , it will still be considered as part of the car fleet. Return the number of car fleets that will arrive at the destination.

## Approach

The implementation uses **Sorting** inside `carFleet(int target, int[] position, int[] speed) -> int`:

1. **Initialization**: Set up pointers, counters, and auxiliary data structures needed by `carFleet(int target, int[] position, int[] speed) -> int`.
2. **Core Traversal**: Apply **Sorting** — inspect each element or state transition and update the tracked result.
3. **Invariant Maintenance**: Advance pointers / window boundaries while preserving all loop invariants.
4. **Return Result**: Finalize and return the accumulated result or modified structure.

## Key Concepts

- **Data Structure**: Hash Map (`HashMap`)
- **Data Structure**: Fixed-Size Array
- **Algorithm / Technique**: Sorting
- **Algorithm / Technique**: Direct Iterative Traversal / Simulation

## Java Solution

The complete Java implementation is available in [`CarFleet.java`](./CarFleet.java).

## Complexity Analysis

- **Time Complexity**: $\mathcal{O}(n \log n)$
  - Dominated by the sorting step.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - Auxiliary collections proportional to input size are allocated.

## Key Takeaways

- Choosing **sorting** leads to an efficient solution for this class of problem.
- Keeping auxiliary allocations minimal ensures the solution remains space-optimal.
