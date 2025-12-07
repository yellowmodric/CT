import java.util.Scanner;

public class 연속된자연수합 {
    // public int Solution (int n) {
    //     int answer = 0;
    //     int lt = 1;
    //     int sum = 0;

    //     //시간복잡도 줄이는 방법
    //     for (int i=1; i<=n/2+1; i++) {
    //         sum += i;

    //         if (sum == n) {
    //             answer++;
    //         } 

    //         while (sum >= n) {
    //             sum -= lt++;

    //             if (sum == n) {
    //                 answer++;
    //             }
    //         }
    //     }
    //     return answer;
    // }

    public int Solution (int n) {
        int answer = 0;
        int sum = 0, lt = 0;
        int m = n/2 + 1;
        int[] arr = new int[m];

        for (int i=0; i<m; i++) {
            arr[i] = i+1;
        }

        for (int rt=0; rt<m; rt++) {
            sum += arr[rt];

            if (sum == n) {
                answer++;
            }

            while (sum >= n) {
                sum -= arr[lt++];

                if (sum == n) {
                    answer++;
                }
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        연속된자연수합 T = new 연속된자연수합();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.Solution(n));
    }
}
