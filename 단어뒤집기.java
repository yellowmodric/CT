import java.util.ArrayList;
import java.util.Scanner;
  
public class 단어뒤집기 {
    public ArrayList<String> Solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        //배열 안 문자열들을 모두 reverse하기
        for (String x : str) {
            char[] reverse = x.toCharArray();
            int start = 0;
            int end = x.length() - 1;

            while (start < end) {
                char tmp = reverse[start];
                reverse[start] = reverse[end];
                reverse[end] = tmp;
                start++;
                end--;
            }

            //다시 스트링으로 바꿔주기
            String st = String.valueOf(reverse);
            answer.add(st);
        }
        return answer;
    }

    // public ArrayList<String> Solution(int n, String[] str) {
    //     ArrayList<String> answer = new ArrayList<>();
    //     for (String x : str) {
    //         //스트링은 불변 객체기 때문에 그냥 변형하려면 새로운 객체가 생성됨
    //         //따라서 스트링빌더를 통해 처리
    //         //지원하는 함수도 많음
    //         String tmp = new StringBuilder(x).reverse().toString();
    //         answer.add(tmp);
    //     }
    //     return answer;
    // }

  public static void main(String[] args){
    단어뒤집기 T = new 단어뒤집기();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] str = new String[n];
    for (int i=0; i<n; i++) {
        str[i] = sc.next();
    }
    for (String x : T.Solution(n, str)) {
        System.out.println(x);
    }
  }
}