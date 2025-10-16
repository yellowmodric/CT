import java.util.Scanner;

public class 문장속단어 {
    public String Solution(String str) {
        String answer = "";
        int min = 0;
        //단어 단위로 끊어서 문자열 길이 구해서 비교
        String[] word = str.split(" ");
        for (String w : word) {
            //같다를 하면 안되는 이유는 뒷쪽에서 같은 길이가 나오면 그걸로 갱신됨
            if (w.length() > min) {
                min = w.length();
                answer = w;
            }
        }
        return answer;
    }

    // public String Solution(String str) {
    //     String answer = "";
    //     int min = 0, pos;
    //     while ((pos = str.indexOf(' ')) != -1) {
    //         String tmp = str.substring(0, pos);
    //         int len = tmp.length();
            
    //         if (len > min) {
    //             min = len;
    //             answer = tmp;
    //         }

    //         //str 변경
    //         str = str.substring(pos+1);
    //     }
    //     if (str.length() > min) {
    //         answer = str;
    //     }
    //     return answer;
    // }

    public static void main(String[] args) {
        문장속단어 T = new 문장속단어();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.Solution(str));
    }
}
