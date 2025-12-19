import java.util.Scanner;

public class 중복문자제거 {
    public String Solution(String str) {
        String answer = "";
        
        //하나씩 순회하며 비교
        for (int i=0; i<str.length(); i++) {
            //만약 중복 문자가 아니라면 answer에 추가
            // System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            //indexOf 함수는 찾는 원소의 가장 첫번째 인덱스만 반환

            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        중복문자제거 T = new 중복문자제거();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}
