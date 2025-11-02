import java.util.Scanner;

public class 암호 {
    public String Solution(int a, String str) {
        String answer = "";

        //7개씩 끊기
        for (int i=0; i<a; i++) {
            //#은 1로, *는 0으로 바꿔주기
            String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
            //2진수를 10진수로 바꾸기
            int num = Integer.parseInt(tmp, 2);
            //10진수를 문자로 바꿔서 answer에 넣기
            answer += (char) num;
            str = str.substring(7);

        }
        return answer;
    }
    public static void main(String[] args) {
        암호 T = new 암호();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = sc.next();
        System.out.println(T.Solution(a, str));
    }
}
