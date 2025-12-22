import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class k번째큰수 {
    public int Solution(int n, int k, int[] arr) {
        int answer = -1;
        //중복 제거 + 정렬(기본적으로 오름차순)
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int l=j+1; l<n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;

        for (int x : set) {
            cnt++;

            if (cnt == k) {
                answer = x;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        k번째큰수 T = new k번째큰수();
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
