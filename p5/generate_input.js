const { generateRandomInt } = require("../utils");

const K = generateRandomInt(1, 71);
const M = generateRandomInt(1, 6);
const N = generateRandomInt(1, 41);

console.info(K);
console.info(M);
console.info(N);

for (let i = 0; i < N; ++i) {
    console.info(generateRandomInt(2, 11));
}
