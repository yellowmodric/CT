import java.util.Scanner;

public class 유효한팰린드롬 {

    public String Solution(String str) {
        String answer = "YES";

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            char s = str.charAt(start);
            char e = str.charAt(end);
            s = Character.toUpperCase(s);
            e = Character.toUpperCase(e);

            if (Character.isAlphabetic(s) && Character.isAlphabetic(e)) {
                //같은 문자인지 검사
                if (s != e) {
                    return "NO";
                }
                start++;
                end--;
            }
            else if (!Character.isAlphabetic(s)) {
                start++;
            }
            else if (!Character.isAlphabetic(e)) {
                end--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        유효한팰린드롬 T = new 유효한팰린드롬();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.Solution(str));
    }
}