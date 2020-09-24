# Scheduling the First Meeting

Everybody knows that scheduling an online meeting is not easy. The first meeting is not different!

## Problem Statement

The SINF organization team takes their job very seriously. In order to make great decisions, it's necessary for as many people as possible to be present!

In the next week, the team **must** meet to make one of the most important decisions in every event: The number of border-width pixels in the top left corner of the logo.

To ensure maximum attendence, the event's coordinator has asked everyone in the team to share their availability, so that the meeting can take place **in the day when most people are available**. Moreover, in case of a tie, the meeting should take place as early in the as possible.

Can you help the organization team figure out the best day to meet?

## Input Format

The first line indicates the number ***N*** of members in the organization team.

There are ***N*** subsequent lines, where each line indicates the identifier ***I*** of the day each team member prefers.

A day identifier ***I*** consists in single digit, where **0** represents **Monday**, **1** represents **Tuesday**, ..., and **6** represents **Sunday**.

The following input example represents the availability of three members:

```
6
0
5
1
1
2
5
```

## Constraints

- 1 <= ***N*** <= 500
- 0 <= ***I*** <= 6

## Output Format

The output should be a single digit, representing the identifier of the day with the most member availability.

Example:

```
1
```
