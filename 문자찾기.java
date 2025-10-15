import java.util.*;
  
public class 문자찾기 {
  public int Solution(String str, char c) {
    int count = 0;
    //대소문자를 모두 소문자로 변환
    str = str.toLowerCase();
    c = Character.toLowerCase(c);
    System.out.println(str);
    
    //문자열을 모두 돌면서 c가 나오면 count 올려주기
    // for (int i=0; i<str.length(); i++) {
    //   if (str.charAt(i) == c) {
    //   	count++;
    //   }
    // }
    for (char x : str.toCharArray()) {
      if (x == c) {
        count++;
      }
    }
    
    return count;
  }
  
  public static void main(String[] args){
    문자찾기 T = new 문자찾기();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char c = sc.next().charAt(0);
    System.out.println(T.Solution(str, c));
    sc.close();
  }
}