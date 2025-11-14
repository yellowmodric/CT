import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {
    public char Solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> c = new HashMap<>();
        int max = 0;

        //맵에 넣는 방법
        for (int i=0; i<n; i++) {
            c.put(str.charAt(i), c.getOrDefault(str.charAt(i), 0) + 1);
        }

        //맵 안에 해당 키가 있는지 없는지 알아보는 메소드
        // System.out.println(c.containsKey('A'));
        //맵 사이즈
        // System.out.println(c.size());
        //맵에서 특정 문자 삭제
        // System.out.println(c.remove('A'));

        //map 출력 방법
        // for (char key : c.keySet()) {
        //     System.out.print(key + "" + c.get(key));
        // }

        //맵 탐색할 때 keySet으로
        for (char key : c.keySet()) {
            if (c.get(key) > max) {
                max = c.get(key);
                answer = key;
            }
        }
        return answer;

    }
    
    public static void main(String[] args) {
        학급회장 T = new 학급회장();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.Solution(n, str));
    }
}
