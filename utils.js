/**
 * Generate random integer
 * @param {Integer} from Minimum number, inclusive
 * @param {Integer} to Maximum number, exclusive
 * @returns {Integer} Random integer
 */
const generateRandomInt = (from, to) => (
    from + Math.floor(Math.random() * (to - from))
);

/**
 * Shuffle an array
 * @param {Array} arr
 * @returns {Array} Shuffled array
 */
const shuffleArray = (arr) => {
    const shuffled_arr = [...arr];

    for (let i = shuffled_arr.length - 1; i > 0; --i) {
        const j = Math.floor(Math.random() * (i + 1));
        const temp = shuffled_arr[i];
        shuffled_arr[i] = shuffled_arr[j];
        shuffled_arr[j] = temp;
    }

    return shuffled_arr;
};

const LOWERCASE_ALPHABET_START = "a".charCodeAt(0);
const UPPERCASE_ALPHABET_START = "A".charCodeAt(0);
const ALPHABET_SIZE = 26;
const VOWELS = Object.freeze(["a", "e", "i", "o", "u"]);

const generateRandomLowercaseChar = () => (
    String.fromCharCode(generateRandomInt(LOWERCASE_ALPHABET_START, LOWERCASE_ALPHABET_START + ALPHABET_SIZE))
);

const generateRandomUppercaseChar = () => (
    String.fromCharCode(generateRandomInt(UPPERCASE_ALPHABET_START, UPPERCASE_ALPHABET_START + ALPHABET_SIZE))
);

const generateRandomString = (size) => {
    let string = "";

    for (let i = 0; i < size; ++i) {
        string += generateRandomLowercaseChar();
    }

    return string;
};

const generateRandomVowel = () => (
    VOWELS[generateRandomInt(0, VOWELS.length)]
);

const generateRandomDecision = () => (
    generateRandomInt(0, 2) === 0
);

module.exports = {
    generateRandomInt,
    shuffleArray,
    generateRandomLowercaseChar,
    generateRandomUppercaseChar,
    generateRandomString,
    generateRandomVowel,
    generateRandomDecision,
};
