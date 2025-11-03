import java.util.ArrayList;
import java.util.Scanner;

public class 보이는학생 {
    public int Solution(int n, int[] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        //첫번째 학생은 무조건 볼 수 있음
        li.add(arr[0]);
        int max = arr[0];

        for (int i=1; i<n; i++) {
            //앞보다 커야지만 볼 수 있음
            if (max < arr[i]) {
                max = arr[i];
                li.add(max);
            }
        }

        return li.size();
    }

    public static void main(String[] args) {
        보이는학생 T = new 보이는학생();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.Solution(n, arr));
    }
}
