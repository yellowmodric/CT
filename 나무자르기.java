import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 나무자르기 {
    public long count(long[] arr, long mid) {
        long cnt = 0;
        
        for (long x : arr) {
            if (x >= mid) {
                cnt += x - mid;
            }
        }
        return cnt;
    }

    public long Solution(int n, long m, long[] arr) {
        long answer = 0;
        Arrays.sort(arr);
        long lt = 0;
        long rt = arr[n-1];

        while (lt <= rt) {
            long mid = (lt + rt) / 2;

            if (count(arr, mid) >= m) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException{
        나무자르기 T = new 나무자르기();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long[] arr = new long[n];

        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Long.parseLong(st2.nextToken());
        }

        System.out.println(T.Solution(n, m, arr));
    }
}
