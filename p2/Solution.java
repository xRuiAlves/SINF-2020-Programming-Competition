import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Solution {
    private static int[] meeting_days;
    private static int[] costs;

    public static void main(String[] args) {
        parseInput();

        int last_day = meeting_days[meeting_days.length - 1];
        int[] best_costs = new int[last_day + 1];
        boolean[] has_meeting = new boolean[last_day + 1];

        for (int day : meeting_days) {
            has_meeting[day] = true;
        }

        best_costs[0] = 0;
        for (int i = 1; i <= last_day; ++i) {
            if (!has_meeting[i]) {
                best_costs[i] = best_costs[i-1];
            } else {
                best_costs[i] = best_costs[i-1] + costs[0];

                if (i - 3 >= 0) {
                    best_costs[i] = Math.min(best_costs[i], best_costs[i - 3] + costs[1]);
                } else {
                    best_costs[i] = Math.min(best_costs[i], costs[1]);
                }

                if (i - 7 >= 0) {
                    best_costs[i] = Math.min(best_costs[i], best_costs[i - 7] + costs[2]);
                } else {
                    best_costs[i] = Math.min(best_costs[i], costs[2]);
                }
            }
        }

        System.out.println(best_costs[last_day]);
    }

    private static void parseInput() {
        List<Integer> availabilities = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String meetings_line = scanner.nextLine();
        String costs_line = scanner.nextLine();

        meeting_days = Arrays.stream(meetings_line.split(" ")).mapToInt(Integer::parseInt).toArray();
        costs = Arrays.stream(costs_line.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
