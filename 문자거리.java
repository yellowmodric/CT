import java.util.*;

public class 문자거리 {
    public int[] Solution(String str, char c) {
        int[] answer = new int[str.length()];
        int min = 10;

        //순회하며 각 문자가 c랑 얼마나 떨어져있는지
        for (int i=0; i<str.length(); i++) {

            //만약 c라면 0
            if (str.charAt(i) == c) {
                answer[i] = 0;
                min = 0;
            } 
            //아니면 얼마나 떨어져 있는지 계산
            else {
                min++;
                answer[i] = min;
            }
        }

        //다른 문자랑 더 가까울 수도 있으니 뒤에서부터 또 순회
        min = 10;
        for (int i=str.length()-1; i>=0; i--) {
            if (str.charAt(i) == c) {
                answer[i] = 0;
                min = 0;
            } else {
                min++;
                //앞에서부터 잰 거리랑 비교해서 가까운 거 넣기
                answer[i] = Math.min(answer[i], min);
            }
        }
        
        return answer;
    }

    // 강의코드
    // public int[] Solution(String s, char t) {
    //     int[] answer = new int[s.length()];
    //     int p = 1000;

    //     for (int i=0; i<s.length(); i++) {
    //         if (s.charAt(i) == t) {
    //             p = 0;
    //             answer[i] = p;
    //         } else {
    //             p++;
    //             answer[i] = p;
    //         }
    //     }

    //     for (int i=s.length()-1; i>0; i--) {
    //         if (s.charAt(i) == t) {
    //             p = 0;
    //         } else {
    //             answer[i] = Math.min(answer[i], p);
    //         }
    //     }
    //     return answer;
    // }

    public static void main(String[] args) {
        문자거리 T = new 문자거리();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x : T.Solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}