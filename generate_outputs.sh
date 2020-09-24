#!/bin/bash

problem_dir=$1

cd $problem_dir
javac Solution.java
i=0

for input_file in input/*.txt; do
    echo "Generating output number $i"
    i=$((i + 1))
    output_file="${input_file//in/"out"}"
    java Solution < $input_file > $output_file
done
