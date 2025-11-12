import java.util.Scanner;

public class 점수계산 {
    public int Solution(int n, int[] arr) {
        int answer = 0;
        int[] score = new int[n];
        int count = 0;

        for (int i=0; i<n; i++) {
            //틀렸을 경우 무조건 0점
            if (arr[i] == 0) {
                score[i] = 0;
                count = 0;
            } else {
                count++;
                score[i] = count;
            }
        }

        for (int x : score) {
            answer += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        점수계산 T = new 점수계산();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.Solution(n, arr));
    }
}
