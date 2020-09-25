const {
    generateRandomInt, generateRandomString,
} = require("../utils");

const num_themes = generateRandomInt(2, 101);
const pairs = [];

for (let i = 0; i < num_themes; ++i) {
    const size = generateRandomInt(2, 16);

    const titles = [];
    for (let j = 0; j < size; ++j) {
        titles.push(generateRandomString(10));
    }

    for (let j = 0; j < size; ++j) {
        for (let k = j + 1; k < size; ++k) {
            pairs.push([titles[j], titles[k]]);
        }
    }
}

console.info(pairs.length);
for (const pair of pairs) {
    console.info(pair[0]);
    console.info(pair[1]);
}
