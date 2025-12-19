import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {
    public String Solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i=0; i<s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i=0; i<s2.length(); i++) {
            if (!map.containsKey(s2.charAt(i)) || map.get(s2.charAt(i)) == 0) {
                return "NO";
            }
            map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
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
