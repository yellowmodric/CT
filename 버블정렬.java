import java.util.Scanner;

public class 버블정렬 {
    public int[] Solution(int n, int[] arr) {
        //버블정렬은 가장 큰 숫자부터 뒤에다 확정시키는 것
        //제일 큰 숫자가 뒤로 계속 미뤄져서 뒤부터 확정

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        버블정렬 T = new 버블정렬();
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
