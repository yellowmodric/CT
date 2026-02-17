import java.util.Arrays;
import java.util.Scanner;

public class 마구간 {
    public int count(int[] arr, int distance) {
        int cnt = 1;
        int first = arr[0];

        for (int i=1; i<arr.length; i++) {
            if (arr[i] - first >= distance) {
                cnt++;
                first = arr[i];
            }
        }

        return cnt;
    }

    public int Solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = arr[0];
        int rt = arr[n-1] - lt;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        마구간 T = new 마구간();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.Solution(n, c, arr));
    }
}
