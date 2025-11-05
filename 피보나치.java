import java.util.Scanner;

public class 피보나치 {
    public int[] Solution(int n) {
        int[] answer = new int[n];

        for (int i=0; i<n; i++) {
            if (i == 0 || i == 1) {
                answer[i] = 1;
            } else {
                answer[i] = answer[i-2] + answer[i-1];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        피보나치 T = new 피보나치();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int x : T.Solution(n)) {
            System.out.print(x + " ");
        }
    }
}
