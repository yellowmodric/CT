import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {
    public String Solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        //먼저 첫번째 문자열 map에 넣기
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            //맵에 키가 없을 경우, 개수가 0인 경우는 NO
            if (!map.containsKey(c) || map.get(c) == 0) {
                return "NO";
            }

            //키가 있을 경우 개수를 계산해야 함
            //하나씩 빼주기
            map.put(c, map.get(c) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        아나그램 T = new 아나그램();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(T.Solution(s1, s2));
    }
}