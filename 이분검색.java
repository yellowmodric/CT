import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {
    public int Solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        for (int i=0; i<n; i++) {
            if (arr[i] == m) {
                return i+1;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        이분검색 T = new 이분검색();
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
