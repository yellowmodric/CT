import java.util.Scanner;

public class 숫자만추출 {
    public int Solution(String str) {
        String answer = "";

        char[] ch = str.toCharArray();

        for (char c : ch) {
            //숫자인지를 판별하는 함수
            if (Character.isDigit(c)) {
                answer += c;
            }
        }

        return Integer.parseInt(answer);
    }

    // public int Solution(String str) {
    //     int answer = 0;
    //     for (char x : str.toCharArray()) {
    //         if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
    //     }
    //     return answer;
    // }

    public static void main(String[] args) {
        숫자만추출 T = new 숫자만추출();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}
