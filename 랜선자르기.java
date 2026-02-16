import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 랜선자르기 {
    public long count(long[] arr, long length) {
        long sum = 0;

        for (long x : arr) {
            sum += x / length;
        }
        return sum;
    }
    public long Solution(int k, long n, long[] arr) {
        long answer = 0;
        long lt = 1;
        long rt = Arrays.stream(arr).max().getAsLong();

        while (lt <= rt) {
            long mid = (lt + rt) / 2;

            if (count(arr, mid) < n) {
                rt = mid - 1;
            } else {
                answer = mid;
                lt = mid + 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException{
        랜선자르기 T = new 랜선자르기();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int k = Integer.parseInt(st.nextToken());
        long n = Long.parseLong(st.nextToken());
        long[] arr = new long[k];

        for (int i=0; i<k; i++) {
            arr[i] = Long.parseLong(bf.readLine());
        }

        System.out.println(T.Solution(k, n, arr));
    }
}
