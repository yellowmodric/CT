public class 최소최대값구현 {
    class Node {
        int val;
        Node next;
    }

    int findMin(Node head) {
        int min = Integer.MAX_VALUE;
        Node cur = head;
        while (cur != null) {
            min = Math.min(min, cur.val);
            cur = cur.next;
        }

        return min;
    }

    public static void main(String[] args) {
        
    }
}