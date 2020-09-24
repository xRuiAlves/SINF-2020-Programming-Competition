const { generateRandomInt } = require("../utils");

const N = generateRandomInt(1, 100);
console.info(N);

for (let i = 0; i < N; ++i) {
    console.info(generateRandomInt(0, 7));
}
