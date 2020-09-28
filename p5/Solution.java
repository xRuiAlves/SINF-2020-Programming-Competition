import java.util.Scanner;

class Solution {
    private static int[] attendants_num_courses;
    private static int target;
    private static int min_attendant_count;

    private static int combinations = 0;

    public static void main(String[] args) {
        parseInput();

        visit(target, 0, 0);

        System.out.println(combinations);
    }

    private static void parseInput() {
        Scanner scanner = new Scanner(System.in);
        target = Integer.parseInt(scanner.nextLine());
        min_attendant_count = Integer.parseInt(scanner.nextLine());
        int num_attendants = Integer.parseInt(scanner.nextLine());
        attendants_num_courses = new int[num_attendants];

        for (int i = 0; i < num_attendants; ++i) {
            attendants_num_courses[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    private static void visit(int sum, int idx, int attendant_count) {
        if (sum == 0) {
            if (attendant_count >= min_attendant_count) {
                ++combinations;
            }
            return;
        }
        if (sum < 0) {
            return;
        }

        for (int i = idx; i < attendants_num_courses.length; ++i) {
            visit(sum - attendants_num_courses[i], i + 1, attendant_count + 1);
        }
    }
}
