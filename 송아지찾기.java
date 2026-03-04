import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기 {
    public int Solution(int s, int e) {
        int answer = 0;
        int[] dis = {-1, 1, 5};
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[10001];
        queue.offer(s);
        visited[s] = true;

        while (!queue.isEmpty()) {
            int len = queue.size();

            for (int i=0; i<len; i++) {
                int x = queue.poll();

                if (x == e) return answer;

                for (int j=0; j<3; j++) {
                    int nx = x + dis[j];
                    if (nx >= 1 && nx <= 10000 && !visited[nx]) {
                        visited[nx] = true;
                        queue.offer(nx);
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
