import java.util.Scanner;

public class 회문문자열 {
    // public String Solution(String str) {
    //     String answer = "YES";
    //     String lower = str.toLowerCase();
        
    //     int start = 0;
    //     int end = str.length() - 1;

    //     while (start < end) {
    //         if (lower.charAt(start) != lower.charAt(end)) {
    //             return "NO";
    //         }
    //         start++;
    //         end--;
    //     }

    //     return answer;
    // }

    // public String Solution(String str) {
    //     String answer = "YES";
    //     str = str.toUpperCase();
    //     int len = str.length();
    //     for (int i=0; i<len/2; i++) {
    //         if (str.charAt(i) != str.charAt(len-i-1)) {
    //             return "NO";
    //         }
    //     }
    //     return answer;
    // }

    public String Solution(String str) {
        String answer = "NO";
        String sb = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(sb)) {
            return "YES";
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
