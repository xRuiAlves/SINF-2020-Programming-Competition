const { generateRandomInt, shuffleArray } = require("../utils");

const R1 = generateRandomInt(2, 6);
const R2 = generateRandomInt(7, 11);
const R3 = generateRandomInt(12, 15);

const days = [];
for (let i = 1; i <= 30; ++i) {
    days.push(i);
}

const num_days = generateRandomInt(1, 21);
const shuffled_days = shuffleArray(days).slice(0, num_days).sort((d1, d2) => d1 - d2);

let month_days = "";
for (let i = 0; i < shuffled_days.length; ++i) {
    month_days += shuffled_days[i] + (i !== shuffled_days.length - 1 ? " " : "");
}

console.info(month_days);
console.info(`${R1} ${R2} ${R3}`);
