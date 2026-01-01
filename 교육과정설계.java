import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계 {
    public String Solution(String need, String str) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for (int i=0; i<need.length(); i++) {
            queue.offer(need.charAt(i));
        }

        for (char c : str.toCharArray()) {
            if (queue.isEmpty()) {
                return answer;
            }

            if (c == queue.peek()) {
                queue.poll();
            } 
        }

        if (!queue.isEmpty()) {
            return "NO";
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        교육과정설계 T = new 교육과정설계();
        Scanner sc = new Scanner(System.in);
        String need = sc.next();
        String str = sc.next();
        System.out.println(T.Solution(need, str));
    }
}
