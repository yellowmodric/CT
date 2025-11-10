import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은소수 {
    public boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i=2; i<num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    public ArrayList<Integer> Solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        //먼저 배열 안에 있는 수 뒤집기
        for (int i=0; i<n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            
            //소수면 답에 집어넣기
            if (isPrime(res)) {
                answer.add(res);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        뒤집은소수 T = new 뒤집은소수();
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
