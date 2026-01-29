import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}
public class 좌표정렬 {

    public static void main(String[] args) {
        //좌표정렬(2차원 평면에 점 N개), 우선순위 큐, 스위핑?
        //객체 정렬이 필요한데 단순 int가 아니라 좌표/상태/노드일 때 사용
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y));
        }

        Collections.sort(arr);

        for (Point p : arr) {
            System.out.println(p.x + " " + p.y);
        }
    }
}