# 853. Car Fleet

- **Problem Number**: 853
- **Difficulty**: Medium
- **LeetCode Link**: [Car Fleet](https://leetcode.com/problems/car-fleet/)

## Problem Statement

There are $n$ cars going to the same destination along a one-lane road. The destination is at position `target` miles away. You are given two integer arrays `position` and `speed`, where `position[i]` and `speed[i]` represent the position and speed of the $i$-th car respectively.

A car cannot pass another car ahead of it, but it can catch up to it and drive at the same speed as the lead car, forming a "car fleet". A car that starts at the same position or arrives at the target at or before another car ahead joins the fleet. Return the total number of car fleets that will arrive at the destination.

## Approach

The implementation simulates fleet formation by processing cars from the closest to the furthest from the target:

1. **Map Position to Speed**:
   - Store the initial mapping between each car's starting position and its speed in a `HashMap<Integer, Integer> map`.
2. **Sort by Starting Position**:
   - Sort the `position` array in ascending order (`Arrays.sort(position)`), ordering cars from furthest from the target to closest.
3. **Compute Time to Target**:
   - For each car at `position[j]`, compute the exact time required to reach the destination independently:
     $$\text{time}[j] = \frac{\text{target} - \text{position}[j]}{\text{map.get}(\text{position}[j])}$$
4. **Iterate from Lead Car (Closest to Target)**:
   - Traverse the `time` array backwards from the car closest to the target ($k = \text{position.length} - 1$ down to $0$):
     - The current car at index $k$ sets the pace as the leader of a new fleet with time `currTime = time[k]`. Increment `count++`.
     - **Merge Trailing Cars**: An inner loop checks preceding cars: while $k > 0$ and $\text{time}[k - 1] \le \text{currTime}$, the car at $k - 1$ travels fast enough to catch up to the current lead car before or at the target. Because it cannot pass, it merges into this fleet, so decrement $k--$.
     - Move past the merged fleet with an additional $k--$.
5. **Return**: Return `count`.

## Key Concepts

- **Greedy Traversal & Lead Car Dominance**: By scanning cars from closest to furthest, the lead car of each fleet determines the arrival time threshold for all trailing cars.
- **Physics Rate Equation**: Expressing progress as time to arrival ($t = \frac{\Delta d}{v}$) simplifies spatial collision checks into monotonic time comparisons.
- **Sorting with Hash Table Mapping**: Sorting positions while preserving speeds via a hash map decouples coordinate sorting from multi-property tuple objects.

## Java Solution

The complete Java implementation is available in [`CarFleet.java`](./CarFleet.java).

## Complexity Analysis

Let $n$ be the number of cars:

- **Time Complexity**: $\mathcal{O}(n \log n)$
  - Storing coordinates into the `HashMap` takes $\mathcal{O}(n)$ time.
  - Sorting `position` using `Arrays.sort()` takes $\mathcal{O}(n \log n)$ time.
  - Calculating times and traversing backwards with two pointers runs in $\mathcal{O}(n)$ time, as each index $k$ is decremented at most once.
  - Total time complexity is dominated by sorting: $\mathcal{O}(n \log n)$.

- **Auxiliary Space Complexity**: $\mathcal{O}(n)$
  - The `HashMap` stores $n$ position-to-speed pairs.
  - The `time` array stores arrival times for $n$ cars.

## Key Takeaways

- Scanning backwards from the car closest to the target makes fleet detection straightforward: any trailing car that arrives earlier than or at the same time as the fleet leader ahead must join that fleet.
- Converting spatial movement problems into independent time-to-destination values allows linear merging logic following an initial sort.
