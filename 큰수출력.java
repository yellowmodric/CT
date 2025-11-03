import java.util.ArrayList;
import java.util.Scanner;

public class 큰수출력 {
    public ArrayList<Integer> Solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        //첫 번째 수는 무조건 출력
        answer.add(arr[0]);

        //차례대로 순회
        for (int i=1; i<n; i++) {
            //만약 자신의 바로 앞이 더 작다면
            if (arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        큰수출력 T = new 큰수출력();
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
