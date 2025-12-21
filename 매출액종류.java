import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 매출액종류 {
    public ArrayList<Integer> Solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        answer.add(map.size());

        //슬라이딩 윈도우 + 맵 사용 문제
        int lt = 0;
        int rt = lt + k;

        while (rt < arr.length) {
            if (map.get(arr[lt]) == 1) {
                map.remove(arr[lt]);
            } else {
                map.put(arr[lt], map.get(arr[lt]) - 1);
            }

            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            
            //키 종류의 개수를 어케 구하지..
            //map.size() 함수!!!
            answer.add(map.size());
            lt++;
            rt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        매출액종류 T = new 매출액종류();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.Solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
}