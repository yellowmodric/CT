import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기 {
    public int Solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : moves) {
            i--;
            for (int j=0; j<n; j++) {
                if (board[j][i] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[j][i]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][i]);
                    }
                    board[j][i] = 0;
                    break;
                }
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        크레인인형뽑기 T = new 크레인인형뽑기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];

        for (int i=0; i<m; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(T.Solution(n, board, m, moves));
    }
}
