import java.util.Scanner;

public class 임시반장 {
    public int Solution (int n, int[][] arr) {
        int answer = 0;
        int max = 0;

        for (int i=0; i<n; i++) {
            int count = 0;
            for (int j=0; j<n; j++) {
                for (int k=0; k<5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (max < count) {
                max = count;
                answer = i+1;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        임시반장 T = new 임시반장();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];

        for (int i=0; i<n; i++) {
            for (int j=0; j<5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.Solution(n, arr));
    }
}
