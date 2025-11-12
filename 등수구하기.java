import java.util.Scanner;

public class 등수구하기 {
    public int[] Solution(int n, int[] arr) {
        int[] answer = new int[n];
        
        for (int i=0; i<n; i++) {
            answer[i] = 1;
        }

        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] < arr[j]) {
                    answer[i]++;
                } else if (arr[i] > arr[j]) {
                    answer[j]++;
                }
            }
        }
        return answer;
    }

    // 강의 코드
    // public int[] Solution(int n, int[] arr) {
    //     int[] answer = new int[n];

    //     for (int i=0; i<n; i++) {
    //         int cnt = 1;
    //         for (int j=0; j<n; j++) {
    //             if (arr[j] > arr[i]) cnt++;
    //         }
    //         answer[i] = cnt;
    //     }
    //     return answer;
    // }

    public static void main(String[] args) {
        등수구하기 T = new 등수구하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.Solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
