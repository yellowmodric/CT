import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {
    public int Solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();

                //앞에가 여는 괄호면 레이저이기 때문에 스택에 있는 괄호 개수를 answer에 더해줌
                if (str.charAt(i-1) == '(') {
                    answer += stack.size();
                } 
                //아니면 막대기라 현재 막대기 하나만 answer에 더해줌
                else {
                    answer++;
                }
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        쇠막대기 T = new 쇠막대기();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}
