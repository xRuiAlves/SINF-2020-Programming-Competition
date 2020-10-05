const { generateRandomInt, shuffleArray } = require("../utils");

const N = generateRandomInt(2, 35);
console.info(N);

const seats = [];
for (let i = 1; i <= N; ++i) {
    seats.push(i);
}

for (let i = 0; i < N; ++i) {
    const num_seats = generateRandomInt(1, N + 1);

    const member_seats = shuffleArray(seats).slice(0, num_seats);
    console.info(member_seats.join(" "));
}
