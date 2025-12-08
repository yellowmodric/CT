import java.util.Scanner;

public class 최대길이연속부분수열 {
    public int Solution(int n, int k, int[] arr) {
        int answer = 0;
        //투포인터나 슬라이딩윈도우 사용..
        //r과 l 사용
        //r이 가면서 0을 만나면 count++
        //count 값이 k보다 커지면 l이 가면서 다시 count--

        int l = 0;
        int count = 0;

        for (int r=0; r<n; r++) {
            if (arr[r] == 0) {
                count++;
            }

            while (count > k) {
                if (arr[l] == 0) {
                    count--;
                }
                l++;
            }

            answer = Math.max(answer, r-l+1);
        }
        return answer;
    }
    
    public static void main(String[] args) {
        최대길이연속부분수열 T = new 최대길이연속부분수열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.Solution(n, k, arr));
    }
}
