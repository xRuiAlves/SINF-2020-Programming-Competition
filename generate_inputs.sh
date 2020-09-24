#!/bin/bash

problem_dir=$1
num_inputs=$2

cd $problem_dir

for (( i=0; i<$num_inputs; i++ )); do
    echo "Generating input number $i"
    if (( i<10 )); then
        node generate_input.js > input/input0$i.txt
    else
        node generate_input.js > input/input$i.txt
    fi
done
