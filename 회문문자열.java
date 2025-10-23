import java.util.Scanner;

public class 회문문자열 {
    public String Solution(String str) {
        String answer = "YES";
        String lower = str.toLowerCase();
        
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (lower.charAt(start) != lower.charAt(end)) {
                answer = "NO";
            }
            start++;
            end--;
        }

        return answer;
    }
    public static void main(String[] args) {
        회문문자열 T = new 회문문자열();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}
