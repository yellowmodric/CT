import java.util.Scanner;

public class 격자판최대합 {
    public int Solution(int n, int[][] arr) {
        int answer = 0;
        int max1 = 0, max2 = 0;

        for (int i=0; i<n; i++) {
            max1 = 0;
            max2 = 0;
            for (int j=0; j<n; j++) {
                max1 += arr[i][j];
                max2 += arr[j][i];
            }

            answer = Math.max(answer, max1);
            answer = Math.max(answer, max2);
        }

        max1 = 0;
        max2 = 0;
        for (int i=0; i<n; i++) {
            max1 += arr[i][i];
            max2 += arr[n-i-1][n-i-1];
        }

        answer = Math.max(answer, max1);
        answer = Math.max(answer, max2);
        
        return answer;
    }

    public static void main(String[] args) {
        격자판최대합 T = new 격자판최대합();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.Solution(n, arr));
    } 
}