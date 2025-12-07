public class stack {

    private int[] arr;
    private int top;

    public stack(int size) {
        this.arr = new int[size];
        this.top = 0;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void push(int x) {
        arr[top] = x;
        top++;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }


}