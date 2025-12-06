import java.util.Scanner;

public class 연속부분수열 {
    public int Solution (int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0, rt = 0;
        int sum = 0;

        while (rt < n) {
            sum += arr[rt++];

            if (sum == m) {
                answer++;
            }

            while (sum >= m) {
                sum -= arr[lt++];

                if (sum == m) {
                    answer++;
                }
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        연속부분수열 T = new 연속부분수열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.Solution(n, m, arr));
    }
}
