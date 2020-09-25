const {
    generateRandomInt, generateRandomUppercaseChar, generateRandomString, generateRandomVowel, shuffleArray, generateRandomDecision,
} = require("../utils");

const N = generateRandomInt(3, 10001);
console.info(N);

const valid_percentage = generateRandomInt(10, 21);
const valid_titles = Math.floor(N / valid_percentage);

const generateValidTitle = () => {
    let title = "";

    title += generateRandomUppercaseChar();
    title += generateRandomString(generateRandomInt(3, 7));

    const num_extra_words = generateRandomInt(1, 4);

    for (let i = 0; i < num_extra_words; ++i) {
        title += " ";
        title += generateRandomString(generateRandomInt(3, 7));
    }

    title += generateRandomVowel();

    return title;
};

const generateRandomTitle = () => {
    const num_words = generateRandomInt(1, 4);
    const has_vowel = generateRandomDecision();
    const vowel_index = generateRandomInt(0, num_words);
    const starts_with_uppercase = generateRandomDecision();
    const has_digit = generateRandomDecision();
    const digit_index = generateRandomInt(0, num_words);

    let title = "";
    title += starts_with_uppercase ? generateRandomUppercaseChar() : "";

    for (let i = 0; i < num_words; ++i) {
        if (i !== 0) {
            title += " ";
        }

        title += generateRandomString(generateRandomInt(3, 7));

        if (has_vowel && i === vowel_index) {
            title += generateRandomVowel();
        }

        if (has_digit && i === digit_index) {
            title += generateRandomInt(0, 10);
        }
    }

    return title;
};

const titles = [];

for (let i = 0; i < valid_titles; ++i) {
    titles.push(generateValidTitle());
}

for (let i = 0; i < N - valid_titles; ++i) {
    titles.push(generateRandomTitle());
}

const shuffled_titles = shuffleArray(titles);

for (const title of shuffled_titles) {
    console.info(title);
}
