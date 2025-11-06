import java.util.Scanner;

public class 소수 {
    public int Solution(int n) {
        int count = 0;
        //index 번호가 20까지 가려면 n+1
        int[] answer = new int[n+1];

        for (int i=2; i<=n; i++) {
            //만약 소수면 0, 아니면 1
            if (answer[i] == 0) {
                count++;
                //에라토스테네스 체 - 2의 배수부터 싹다 지우고
                //3의 배수 싹다
                //5의 배수 싹다 이런 식
                for (int j = i; j<=n; j=j+i) {
                    answer[j] = 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        소수 T = new 소수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.Solution(n));
    }
}
