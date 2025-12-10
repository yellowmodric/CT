import java.util.Scanner;

public class 연속된자연수합수학 {
    public int Solution(int n) {
        int answer = 0, cnt = 1;
        n--;

        while (n > 0) {
            cnt++;
            n = n - cnt;

            if (n % cnt == 0) {
                answer++;
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        연속된자연수합수학 T = new 연속된자연수합수학();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.Solution(n));
    }
}
