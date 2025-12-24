import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
    public String Solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) != ')') {
                stack.push(str.charAt(i));
            } else {
                // (가 나올때까지 pop해야 함
                while (stack.peek() != '(') {
                    stack.pop();
                }
                stack.pop();
            }
        }

        for (char c : stack) {
            answer += c;
        }
        return answer;
    }
    
    public static void main(String[] args) {
        괄호문자제거 T = new 괄호문자제거();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}
