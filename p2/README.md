# Minimizing Costs

Meeting rooms are expensive... And who would have thought virtual rooms are even more expensive than real physical ones?!

## Problem Statement

Organizing an event like this poses a lot of challenges! It looks like the team will have to meet a bunch of times if they want to have everything ready on time. In order to make the online meetings as productive as possible, the team will be using the **YAOMR** (Yet Another Online Meeting Room), which operates in a slightly different way than other alternatives.

When using this tool, the team may choose to rent a meeting room for a **single day**, for a period of **three days**, or for a **whole week** (seven days). Since they'll be meeting in a bunch of different days throughout the next month, they want to plan ahead to make sure they're on budget.

Given the days of the month when meetings will take place, can you find the cost of the optimal rental plan for the team?

## Input Format

The first line consists of a list ***D*** indicating the days of the month when meetings will take place, separated by spaces.

The second line consists of a list ***R*** indicating the cost of each of the three rental plans separated by spaces, in the order of **single day** cost, **three days** cost and **seven days** cost.

## Constraints

- 1 <= ***D.length*** <= 30
- 1 <= ***D[i]*** <= 30
- ***D*** is sorted in ascending order
- ***R.length*** = 3
- 2 <= ***R[i]*** <= 14

## Output Format

The output should be a single integer, representing the cost of the optimal rental plan.
