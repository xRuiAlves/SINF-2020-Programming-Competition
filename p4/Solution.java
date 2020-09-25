import java.util.*;

class Solution {
    private static final class Pair {
        String title1;
        String title2;

        Pair(String title1, String title2) {
            this.title1 = title1;
            this.title2 = title2;
        }
    }

    public static void main(String[] args) {
        List<Pair> pairs = readPairs();
        Map<String, Set<String>> graph = new HashMap<>();

        for (Pair p : pairs) {
            Set<String> neighbors1 = graph.getOrDefault(p.title1, null);
            Set<String> neighbors2 = graph.getOrDefault(p.title2, null);

            if (neighbors1 == null) {
                neighbors1 = new HashSet<>();
                graph.put(p.title1, neighbors1);
            }

            if (neighbors2 == null) {
                neighbors2 = new HashSet<>();
                graph.put(p.title2, neighbors2);
            }

            neighbors1.add(p.title2);
            neighbors2.add(p.title1);
        }

        int theme_count = 0;
        Set<String> visited = new HashSet<>();

        for (String title : graph.keySet()) {
            if (!visited.contains(title)) {
                ++theme_count;
                dfs(graph, visited, title);
            }
        }

        System.out.println(theme_count);
    }

    private static void dfs(Map<String, Set<String>> graph, Set<String> visited, String node) {
        if (visited.contains(node)) {
            return;
        }

        visited.add(node);

        for (String neighbor : graph.get(node)) {
            dfs(graph, visited, neighbor);
        }
    }

    private static List<Pair> readPairs() {
        List<Pair> pairs = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; ++i) {
            String title1 = scanner.nextLine();
            String title2 = scanner.nextLine();
            pairs.add(new Pair(title1, title2));
        }

        return pairs;
    }
}
