import java.util.Scanner;

public class LRU {
    public int[] Solution(int s, int n, int[] arr) {
        int[] answer = new int[s];

        for (int x : arr) {
            int tmp = -1;

            for (int i=0; i<s; i++) {
                if (answer[i] == x) {
                    tmp = i;
                }
            }

            if (tmp == -1) {
                for (int i=s-2; i>=0; i--) {
                    answer[i+1] = answer[i];
                }
            } else {
                for (int i=tmp-1; i>=0; i--) {
                    answer[i+1] = answer[i];
                }
            }
            answer[0] = x;
        }
        return answer;
    }

    public static void main(String[] args) {
        LRU T = new LRU();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.Solution(s, n, arr)) {
            System.out.print(x + " ");
        }
    }
}