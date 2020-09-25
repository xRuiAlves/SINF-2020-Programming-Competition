import java.util.*;

class Solution {
    private static final Set<Character> VOWELS = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public static void main(String[] args) {
        List<String> titles = readTitles();

        int count = 0;
        for (String title : titles) {
            count += isTitleValid(title) ? 1 : 0;
        }

        System.out.println(count);
    }

    private static boolean isTitleValid(String title) {
        if (title.length() == 0 || !Character.isAlphabetic(title.charAt(0)) || !Character.isUpperCase(title.charAt(0))) {
            return false;
        }

        String[] tokens = title.split(" ");
        int distinct_words = 0;
        boolean found_vowel = false;

        for (String token : tokens) {
            if (token.length() > 0) {
                ++distinct_words;
            }

            for (char c : token.toCharArray()) {
                if (Character.isDigit(c)) {
                    return false;
                }

                found_vowel = found_vowel || VOWELS.contains(c);
            }
        }

        return distinct_words >= 2 && found_vowel;
    }

    private static List<String> readTitles() {
        List<String> titles = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; ++i) {
            titles.add(scanner.nextLine());
        }

        return titles;
    }
}
