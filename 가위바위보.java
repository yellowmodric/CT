import java.util.Scanner;

public class 가위바위보 {
    public String Solution(int n, int[] arr1, int[] arr2) {
        String answer = "";

        //1이 가위, 2가 바위, 3이 보
        //arr1이랑 arr2를 같이 비교
        for (int i=0; i<n; i++) {
            //먼저 비겼을 때
            if (arr1[i] == arr2[i]) {
                answer += "D";
            } 
            //모든 경우의 수
            else if (arr1[i] == 1 && arr2[i] == 3) {
                answer += "A";
            } else if (arr1[i] == 2 && arr2[i] == 1) {
                answer += "A";
            } else if (arr1[i] == 3 && arr2[i] == 2) {
                answer += "A";
            } else {
                answer += "B";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        가위바위보 T = new 가위바위보();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (char c : T.Solution(n, arr1, arr2).toCharArray()) {
            System.out.println(c);
        }
    }
}
