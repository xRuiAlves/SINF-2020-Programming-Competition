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

module.exports = {
    generateRandomInt,
    shuffleArray,
};
