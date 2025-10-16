import java.util.*;
  
public class 대소문자변환 {
  public String Solution(String str) {
    String answer = "";
    //반복문으로 문자열 순회
    for (int i=0; i<str.length(); i++) {
        //i번째 문자가 대문자인지 소문자인지 판별
        char current = str.charAt(i);
        if (Character.isUpperCase(current)) {
            //바꿔서 answer에다 삽입
            answer += Character.toLowerCase(current);
        } else {
            answer += Character.toUpperCase(current);
        }
    }
    return answer;
  }

//   public String Solution(String str) {
//     String answer = "";
//     for (char x : str.toCharArray()) {
//         if (Character.isLowerCase(x)) {
//             answer += Character.toUpperCase(x);
//         } else {
//             answer += Character.toLowerCase(x);
//         }
//     }
//     return answer;
//   }

// public String Solution(String str) {
//     String answer = "";
//     for (char x : str.toCharArray()) {
//         //아스키코드 대문자
//         if (x >= 65 && x <= 90) {
//             answer += (char) (x + 32);
//         } else {
//             answer += (char) (x - 32);
//         }
//     }
//     return answer;
//   }
  
  public static void main(String[] args){
    대소문자변환 T = new 대소문자변환();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(T.Solution(str));
  }
}