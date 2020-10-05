import java.util.*;
import java.util.stream.Collectors;

class Solution {
    private static final int NUM_SEATS = 35;
    private static final Map<Long, Long> cache = new HashMap<>();

    public static void main(String[] args) {
        List<List<Integer>> seat_preferences = readSeatPreferences();
        List<List<Integer>> team_members = new ArrayList<>();

        for (int i = 0; i <= NUM_SEATS; i++) team_members.add(new ArrayList<>());

        for (int person = 0; person < seat_preferences.size(); person++) {
            for (Integer hat : seat_preferences.get(person)) {
                team_members.get(hat).add(person);
            }
        }

        long full_mask = (1L << seat_preferences.size()) - 1;
        long combinations = getCombinations(team_members, 1, full_mask, 0L);
        System.out.println(combinations);
    }

    private static long getCombinations(List<List<Integer>> team_members, int hat, long mask, long curr) {
        if (mask == curr) {
            return 1;
        }

        if (hat > NUM_SEATS) {
            return 0;
        }

        long key = ((long) hat << (NUM_SEATS + 1)) | curr;
        long cached_val = cache.getOrDefault(key, -1L);

        if (cached_val != -1L) {
            return cached_val;
        }

        long count = getCombinations(team_members, hat + 1,mask, curr);

        for (int person : team_members.get(hat)) {
            long curr_mask = 1L << person;
            long mask_result = curr & curr_mask;

            if (mask_result != 0L) {
                continue;
            }

            count = (count + getCombinations(team_members, hat + 1, mask, curr | curr_mask));
        }

        cache.put(key, count);
        return count;
    }

    private static List<List<Integer>> readSeatPreferences() {
        List<List<Integer>> seat_preferences = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; ++i) {
            seat_preferences.add(Arrays.stream(scanner.nextLine()
                    .split(" "))
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .collect(Collectors.toList())
            );
        }

        return seat_preferences;
    }
}
