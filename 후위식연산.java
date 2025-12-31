import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
    public int Solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        //숫자는 쌓고 연산자는 팝
        char[] ch = str.toCharArray();

        for (int i=0; i<str.length(); i++) {
            if (Character.isDigit(ch[i])) {
                stack.push(ch[i] - '0');
            } else {
                int a = stack.pop();
                int b = stack.pop();
                
                if (ch[i] == '+') {
                    int result = a + b;
                    stack.push(result);
                } else if (ch[i] == '-') {
                    int result = b - a;
                    stack.push(result);
                } else if (ch[i] == '*') {
                    int result = a * b;
                    stack.push(result);
                } else {
                    int result = b / a;
                    stack.push(result);
                }
            }
        }

        answer = stack.pop();
        return answer;
    }
    
    public static void main(String[] args) {
        후위식연산 T = new 후위식연산();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}
