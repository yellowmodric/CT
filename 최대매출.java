import java.util.Scanner;

public class 최대매출 {
    public int Solution (int n, int k, int[] arr) {
        int answer = 0, sum = 0;

        //슬라이딩 윈도우 사용
        for (int i=0; i<k; i++) {
            sum += arr[i];
        }

        answer = sum;

        for (int i=k; i<n; i++) {
            sum += arr[i];
            sum -= arr[i-k];

            //sum += (arr[i] - arr[i-k]);

            if (sum > answer) {
                answer = sum;
            }

            //answer = Math.max(answer, sum);
        }
        return answer;
    }
    
    public static void main(String[] args) {
        최대매출 T = new 최대매출();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.Solution(n, k, arr));
    }
}
