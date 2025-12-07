public class Queue {
    private int[] arr;
    private int head; //꺼낼 위치 (앞)
    private int tail; //넣을 위치
    private int size; //현재 큐에 들어있는 데이터 개수
    private int capacity; //배열 크기

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void offer(int x) {
        arr[tail] = x;
        tail = (tail + 1) % capacity; //tail을 다음 위치로 이동시킴(원형)
        size++;
    }

    public int poll() {
        int val = arr[head];
        head = (head + 1) % capacity;
        size--;
        return val;
    }

    public int peek() {
        return arr[head];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
