import java.util.Scanner;

public class 특정문자뒤집기 {
    public String Solution(String str) {
        String answer = "";
        
        //char 배열로 변환
        char[] ch = str.toCharArray();

        //순회하면서 단어 바꾸기
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            //알파벳이 아닌건 넘기기
            if (!Character.isAlphabetic(ch[start])) {
                start++;
            } else if (!Character.isAlphabetic(ch[end])) {
                end--;
            } 
            //알파벳끼리만 남으면 교환
            else {
                char tmp = ch[start];
                ch[start] = ch[end];
                ch[end] = tmp;
                start++;
                end--;
            }
        }

        answer = String.valueOf(ch);
        return answer;
    }

    public static void main(String[] args) {
        특정문자뒤집기 T = new 특정문자뒤집기();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}