public class 이진수출력 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) {
        이진수출력 T = new 이진수출력();
        T.DFS(11);
    }
}