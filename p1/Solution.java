import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        List<Integer> availabilities = readAvailabilities();
        int[] counts = new int[7];

        for (int day : availabilities) {
            ++counts[day];
        }

        int best = 0;
        for (int i = 1; i < counts.length; ++i) {
            if (counts[i] > counts[best]) {
                best = i;
            }
        }

        System.out.println(best);
    }

    private static List<Integer> readAvailabilities() {
        List<Integer> availabilities = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; ++i) {
            String line = scanner.nextLine();
            availabilities.add(Integer.parseInt(line));
        }

        return availabilities;
    }
}
