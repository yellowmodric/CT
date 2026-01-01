import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기 {
    public int Solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i=1; i<=n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            for (int i=0; i<k-1; i++) {
                int t = queue.poll();
                queue.offer(t);
            }
            queue.poll();
        }

        answer = queue.poll();
        return answer;
    }
    
    public static void main(String[] args) {
        공주구하기 T = new 공주구하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(T.Solution(n, k));
    }
}
