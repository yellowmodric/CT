import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int index;
    int dangerous;

    Person(int index, int dangerous) {
        this.index = index;
        this.dangerous = dangerous;
    }
}

public class 응급실 {
    public int Solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();

        for (int i=0; i<n; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while (!queue.isEmpty()) {
            Person x = queue.poll();

            for (Person p : queue) {
                if (x.dangerous < p.dangerous) {
                    queue.offer(x);
                    x = null;
                    break;
                }
            }
            
            if (x != null) {
                if (x.index == m) {
                    answer++;
                    return answer;
                } else {
                    answer++;
                }
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