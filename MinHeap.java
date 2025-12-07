public class MinHeap {
    private int[] arr;
    private int size;

    public MinHeap(int capacity) {
        arr = new int[capacity+1];
        size = 0;
    }

    public void offer(int x) {
        arr[++size] = x;
        int idx = size;

        while (idx > 1) {
            int parent = idx / 2;

            if (arr[parent] <= arr[idx]) {
                break;
            }

            swap(parent, idx);
            idx = parent;
        }
    }

    public int poll() {
        int min = arr[1];
        arr[1] = arr[size--];
        heapifyDown(1);
        return min;
    }

    //poll하고 흐트러진 배열 정렬
    private void heapifyDown(int idx) {
        while (true) {
            int left = idx * 2;
            int right = idx * 2 + 1;
            int smallest = idx;

            if (left <= size && arr[left] < arr[smallest]) {
                smallest = left;
            }

            if (right <= size && arr[right] < arr[smallest]) {
                smallest = right;
            }

            if (smallest == idx) break;

            swap(idx, smallest);
            idx = smallest;
        }
    }

    private void swap(int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
