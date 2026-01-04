import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int index;
    int risk;
    
    Person(int index, int risk) {
        this.index = index;
        this.risk = risk;
    }
}

public class 응급실 {
    public int Solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        //우선순위 큐 - 내림차순 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        //일단 순서대로 큐에 넣기
        for (int i=0; i<n; i++) {
            queue.offer(new Person(i, arr[i]));
            pq.offer(arr[i]);
        }

        //하나씩 검사하면서 제일 큰 값이 아니면 뒤로 보내기
        //제일 큰 값이라면 poll
        //m번째 값이 몇 번째로 출력되는지를 구하기
        //인덱스 보존 필요 -> 클래스 사용?
        while (!queue.isEmpty()) {
            Person cur = queue.poll();

            //현재 환자가 가장 위험한 경우
            if (cur.risk == pq.peek()) {
                pq.poll();
                answer++;

                if (cur.index == m) {
                    return answer;
                }
            }
            //더 위험한 환자가 있는 경우
            else {
                queue.offer(cur);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        응급실 T = new 응급실();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.Solution(n, m, arr));
    }
}