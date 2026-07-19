// Last updated: 19/07/2026, 21:05:04
import java.util.*;

class Solution {
    public int openLock(String[] deadends, String target) {

        Set<String> dead = new HashSet<>(Arrays.asList(deadends));

        if (dead.contains("0000")) {
            return -1;
        }

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer("0000");
        visited.add("0000");

        int steps = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                String current = queue.poll();

                if (current.equals(target)) {
                    return steps;
                }

                for (int j = 0; j < 4; j++) {

                    char[] chars = current.toCharArray();

                    char original = chars[j];
                    chars[j] = (char) ((original - '0' + 1) % 10 + '0');
                    String next = new String(chars);

                    if (!dead.contains(next) && !visited.contains(next)) {
                        queue.offer(next);
                        visited.add(next);
                    }

                   
                    chars[j] = (char) ((original - '0' + 9) % 10 + '0');
                    next = new String(chars);

                    if (!dead.contains(next) && !visited.contains(next)) {
                        queue.offer(next);
                        visited.add(next);
                    }
                }
            }

            steps++;
        }

        return -1;
    }
}