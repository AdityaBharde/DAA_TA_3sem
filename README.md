# Assignment Solutions for Dynamic Programming and Graph Algorithms

This repository contains solutions to four algorithmic problems, implemented in Java. Each problem is solved using an appropriate algorithm.
The repository is organized by question, with each folder containing the Java source code and a detailed Markdown file explaining the problem, the solution approach, and test cases.

## Table of Contents
* [Q1) Longest Increasing Subsequence](#q1-longest-increasing-subsequence)
* [Q2) Longest Divisible Subset](#q2-longest-divisible-subset)
* [Q3) Multistage Graph Algorithm](#q3-multistage-graph-algorithm)
* [Q4) Minimum Path Sum In a Grid](#q4-minimum-path-sum-in-a-grid)

---

### Q1) Longest Increasing Subsequence
* **Problem:** Find the length of the longest increasing subsequence in an array.
* **Solution:** Dynamic Programming approach with O(N^2) time complexity.
* **Files:** `Q1_LongestIncreasingSubsequence/LongestIncreasingSubsequence.java` and `Q1_LongestIncreasingSubsequence/Q1_LongestIncreasingSubsequence.md`

---

### Q2) Longest Divisible Subset
* **Problem:** Find the longest subset where every pair of elements is divisible by one another.
* **Solution:** Dynamic Programming approach, similar to LIS, on a sorted array.
* **Files:** `Q2_LongestDivisibleSubset/LongestDivisibleSubset.java` and `Q2_LongestDivisibleSubset/Q2_LongestDivisibleSubset.md`

---

### Q3) Multistage Graph Algorithm
* **Problem:** Find the minimum cost path from a source to a sink in a multistage graph.
* **Solution:** Dynamic Programming approach working backward from the sink node.
* **Files:** `Q3_MultistageGraph/MultistageGraph.java` and `Q3_MultistageGraph/Q3_MultistageGraph.md`

---

### Q4) Minimum Path Sum In a Grid
* **Problem:** Find the path with the minimum sum from the top-left to the bottom-right of a grid, moving only right or down.
* **Solution:** Dynamic Programming approach using a 2D DP array.
* **Files:** `Q4_MinimumPathSum/MinimumPathSum.java` and `Q4_MinimumPathSum/Q4_MinimumPathSum.md`
