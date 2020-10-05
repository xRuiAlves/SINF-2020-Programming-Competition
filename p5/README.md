# Organizing the workshop

To have a successful workshop in an event, you must attend to the invited instructor's demands!

## Problem Statement

Having the lectures planned and ready, it's now time to take care of the workshops. Luckily, the organization team quickly found a couple of very interesting candidates!

However, it seems that one of the instructors has a few... unorthodox demands regarding the workshop's attendants. To make sure that all attendants have a very specific degree of tech-expertise, the instructor wants the number of courses all the attendants have completed (summed together) to equal a very specific number. Furthermore, for logistics reasons, the instructor needs a specific minimum number of attendants.

Puzzled by such a request, the organization team needs you to figure out **how many unique combinations of attendants you could fit into the workshop**. Luckily for you, this years' sign-up form, for whatever reason, featured a mandatory field for the "Number of completed courses". Time to work!

## Input Format

The first line indicates the target sum of attendants completed courses ***K***.

The second line indicates the minimum number ***M*** of attendants for the workshop.

The third line indicates the number ***N*** of candidate attendants.

There are ***N*** subsequent lines, where each line features the number of completed courses ***Ci*** of a candidate attendant.

## Constraints

- 1 <= ***K*** <= 70
- 1 <= ***M*** <= 5
- 1 <= ***N*** <= 40
- 1 <= ***Ci*** <= 10

## Output Format

The output should be a single integer, representing the number of unique combinations of attendants.
