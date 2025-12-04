import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통원소구하기 {
    public ArrayList<Integer> Solution(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();

        //투포인터 사용
        int i = 0, j = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                answer.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        공통원소구하기 T = new 공통원소구하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i=0; i<m; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int x : T.Solution(n, arr1, m, arr2)) {
            System.out.print(x + " ");
        }
    }
}
