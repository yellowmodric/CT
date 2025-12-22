import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 모든아나그램찾기 {
    public int Solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        char[] ch = s.toCharArray();

        for (char c : t.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (int i=0; i<t.length(); i++) {
            map2.put(ch[i], map2.getOrDefault(ch[i], 0) + 1);
        }

        if (map1.equals(map2)) {
            answer++;
        }

        int lt = 0;
        int rt = t.length();

        while (rt < s.length()) {
            //lt를 빼고
            if (map2.get(ch[lt]) == 1) {
                map2.remove(ch[lt]);
            } else {
                map2.put(ch[lt], map2.get(ch[lt]) - 1);
            }

            //rt를 넣기
            map2.put(ch[rt], map2.getOrDefault(ch[rt], 0) + 1);

            if (map2.equals(map1)) {
                answer++;
            }

            lt++;
            rt++;
        }
        return answer;
    }
    
    public static void main(String[] args) {
        모든아나그램찾기 T = new 모든아나그램찾기();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(T.Solution(s, t));
    }
}
