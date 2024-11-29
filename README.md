![GitHub contributors](https://img.shields.io/github/contributors/JideMartins/leetcode_challenges_team_10?style=for-the-badge)   ![GitHub Created At](https://img.shields.io/github/created-at/JideMartins/leetcode_challenges_team_10?style=for-the-badge) ![GitHub top language](https://img.shields.io/github/languages/top/jidemartins/leetcode_challenges_team_10?style=for-the-badge)



<h1 align="center"> Team Challenge: Leetcode Problems </h1>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About</a>
      <ul>
        <li><a href="#list-of-challenges">List of Challenges</a></li>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li><a href="#contributors">Contributors</a></li>
  </ol>
</details>

<hr>

<!-- ABOUT THE PROJECT -->
## About The Project
This repository contains the solutions to LeetCode challenges created by the OBSIDI Academy Team 10, Cohort 6. The folder structure is organized like a Maven project, with packages and classes. Each challenge has a dedicated package, and the solutions for each challenge are implemented as classes within that package.


### List of Challenges
1. Challenge One: [Average Salary Excluding the Minimum and Maximum Salary](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/).
2. Challenge Two: [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/description/).

    * Two-pointer Method
      * Step 1: Initialize the necessary variables and arrays
      * Step 2: Square each element in the nums [] array
      * Step 3: Use a two-pointer approach to compare the squared values and place the larger one at the correct position in the sorted array
      * Step 3: Return the sorted array of squares

3. Challenge Three: [Missing Number](https://leetcode.com/problems/missing-number/description/) 

    * Sum Method
        * Step 1: Calculate the expected sum (total) of numbers for 0 to n using the formula for the sum of the first n integeres -> n*(n+1)/2
        * Step 2: Loop through the nums [] array and calculate the sum of its elements
        * Step 3: The difference between the expected sum (total) and the calculated sum (sum) gives the missing number
        * Step 4: Return the missing number

4. Challenge Four: [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/description/)
5. Challenge Five: [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/description/)
   * Steps
        * Step 1: A Dummy node is introduced to simplify the logic for appending nodes to the merged list. It helps handle edge cases like empty input lists.
        * Step 2: A traversal logic is used to detail the merge node from both lists one by one based on their values
        * Step 3: If there are leftover nodes -> leftover nodes from either lists are appended once one list is exhausted 
        * Step 4: Return the result -> the logic skips the dummy node to return the actual merged list.
  


### Built With
![Static Badge](https://img.shields.io/badge/java-orange?style=for-the-badge)
![Static Badge](https://img.shields.io/badge/Maven-black?style=for-the-badge&logo=apachemaven)

<hr>

<!-- CONTRIBUTING -->
## Contributors

<a href = "https://github.com/JideMartins/leetcode_challenges_team_10/graphs/contributors">
  <img src = "https://contrib.rocks/image?repo=JideMartins/leetcode_challenges_team_10"/>
</a>


