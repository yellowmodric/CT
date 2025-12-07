import java.util.Scanner;

public class 연속된자연수합 {
    public int Solution (int n) {
        int answer = 0;
        int lt = 1;
        int sum = 0;

        for (int i=1; i<n; i++) {
            sum += i;

            if (sum == n) {
                answer++;
            } 

            while (sum >= n) {
                sum -= lt++;

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
