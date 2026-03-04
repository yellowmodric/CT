import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기 {
    public int Solution(int s, int e) {
        int answer = 0;
        int[] distance = {-1, 1, 5};
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[10001];
        queue.offer(s);
        visited[s] = true;

        while (!queue.isEmpty()) {
            int n = queue.size();

            for (int i=0; i<n; i++) {
                int x = queue.poll();

                for (int j=0; j<3; j++) {
                    int nx = x + distance[j];

                    if (nx == e) return answer+1;

                    if (nx >= 1 && nx <= 10000 && !visited[nx]) {
                        queue.offer(nx);
                        visited[nx] = true;
                    }
                }
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        송아지찾기 T = new 송아지찾기();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.Solution(s, e));
    }
}