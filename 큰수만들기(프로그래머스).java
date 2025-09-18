import java.util.*;

class Solution {
    public String solution(String number, int k) {
        //그리디란 최적해를 구하는 알고리즘(매 순간 최적해 -> 가장 큰 숫자 구하는 거라)
        //이게 하나라도 포함이 안되면 그리디 대신 DP 쓰기
        //적용 방법 1. 목표 확인(최소/최대)
        //2. 탐욕 기준 세우기(무엇을 기준으로 선택? -> 가장 큰 수부터)
        //3. 반복 적용(조건을 만족하지 않으면 건너뛰기)
        //4. 검증(반례는 없는지)
        
        // 1. 왼쪽 숫자부터 하나씩 스택에 넣기
        Stack<Character> stack = new Stack<>();
        stack.push(number.charAt(0));
        
        for (int i=1; i<number.length(); i++) {
            // 1. 왼쪽 숫자부터 하나씩 스택에 넣기
            char c = number.charAt(i);
            // 2. 그다음 넣을 숫자 > 탑이면 탑을 팝하기 + k 1씩 줄어듦
            while (!stack.isEmpty() && c > stack.peek() && k > 0) {
                stack.pop();
                k--;
            }
            // 3. 그 다음 숫자 넣기
            stack.push(c);
        }
        
        // 4. 만약 다 넣었는데도 k가 0이 아니라면
            while (k > 0) {
                //뒤에서부터 다 자르기
                stack.pop();
                k--;
            }
        
        StringBuilder st = new StringBuilder();
        for (char s : stack) {
            st.append(s);
        }
        return st.toString();
    }
}