# Grouping lecture themes

In order to provide good content throughout the event, it's important to group lectures by theme.

## Problem Statement

After selecting all valid lecture submissions by speakers, the next step is to group them by theme, to make sure that different tech-related themes are covered throughout the event.

One of the organization team members was responsible for analyzing the themes to do this separation. However, that member didn't do a very good job and decided to group them by pairs. An example:

```
"My first CTF" and "Intro to Ethical Hacking"
"My first CTF" and "PenTesting with Kali Linux"
"The story of Kubernetes" and "Dockerizing your first Project"
```

Each pair indicates that those two lectures share the same theme. In the above example, "My first CTF", "Intro to Ethical Hacking" and "PenTesting with Kali Linux" belong to one theme (Security) and "The story of Kubernetes" and "Dockerizing your first Project" belong to another theme (DevOps).

To get a grasp of how "fresh" their options are, the organization team wants to know how many different themes are available. Are you up for the challenge?

## Input Format

The first line indicates the number ***N*** of theme pairs.

There are ***2N*** subsequent lines, where each line features a single lecture title. Two subsequent and non-overlapping lines represent a pair, *i.e.*:

- Lines 1 and 2 represent a pair;
- Lines 3 and 4 represent another pair;
- ...

## Constraints

- 3 <= ***N*** <= 5000

## Output Format

The output should be a single integer, representing the number of different themes.
