public class Deque {
    private int[] arr;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public Deque(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    //원형 배열로 설정
    public int mod(int x) {
        return (x + capacity) % capacity;
    }

    public void addFirst(int x) {
        head = mod(head - 1);
        arr[head] = x;
        size++;
    }

    public void addLast(int x) {
        arr[tail] = x;
        tail = mod(tail + 1);
        size++;
    }

    public int pollFirst() {
        int val = arr[head];
        head = mod(head + 1);
        size--;
        return val;
    }

    public int pollLast() {
        tail = mod(tail - 1);
        int val = arr[tail];
        size--;
        return val;
    }

    public int peekFirst() {
        return arr[head];
    }

    public int peekLast() {
        return arr[mod(tail-1)];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
