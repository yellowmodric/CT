import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {
    public String Solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.add(x);
            } else if (stack.isEmpty() && x == ')') {
                return "NO";
            } else {
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            answer = "NO";
        }
        return answer;
    }
    
    public static void main(String[] args) {
        올바른괄호 T = new 올바른괄호();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}
