import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기 {
    public ArrayList<Integer> Solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int[] original = arr.clone();
        Arrays.sort(original);

        for (int i=0; i<n; i++) {
            if (arr[i] != original[i]) {
                answer.add(i+1);
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        장난꾸러기 T = new 장난꾸러기();
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
