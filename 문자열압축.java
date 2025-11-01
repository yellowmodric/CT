import java.util.Scanner;

public class 문자열압축 {
    public String Solution(String str) {
        String answer = "";
        int count = 1;

        //문자열을 하나씩 순회
        for (int i=0; i<str.length()-1; i++) {
            //문자열 연속이면 숫자 넣기
            char f = str.charAt(i);
            char b = str.charAt(i+1);

            if (f == b) {
                count++;
            } else {
                answer += f;
                if (count > 1) {
                    answer += count;
                }
                count = 1;
            }

            if (i == str.length()-2) {
                if (f == b) {
                    answer += f;
                    if (count > 1) {
                        answer += count;
                    }
                } else {
                    answer += b;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열압축 T = new 문자열압축();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}
