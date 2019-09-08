package algo.data;

public class Heap {

    private int[] heap;
    private int size;
    private int maxSize;

    private static int FRONT = 1;

    public Heap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[this.maxSize + 1];
        heap[0] = Integer.MIN_VALUE;
    }

    public void insert(int element) {
        if (size >= maxSize) {
            return;
        }
        heap[++size] = element;
        int currentIndex = size;

        while (heap[currentIndex] < heap[getParentIndex(currentIndex)]) {
            swap(currentIndex, getParentIndex(currentIndex));
            currentIndex = getParentIndex(currentIndex);
        }
    }

    public int remove() {
        int popped = heap[FRONT];
        heap[FRONT] = heap[size--];
        minHeapify(FRONT);
        return popped;
    }

    private void minHeapify(int index) {
        if (isLeaf(index)) {
            return;
        }
        int leftChildIndex = getLeftChildIndex(index);
        int rightChildIndex = getRightChildIndex(index);
        if (heap[index] < heap[leftChildIndex] && heap[index] < heap[rightChildIndex]) {
            return;
        }

        if (heap[leftChildIndex] < heap[rightChildIndex]) {
            swap(leftChildIndex, index);
            minHeapify(leftChildIndex);
        } else {
            swap(rightChildIndex, index);
            minHeapify(rightChildIndex);
        }
    }

    private boolean isLeaf(int index) {
        if (index >= size / 2 && index <= size) {
            return true;
        }
        return false;
    }

    private int getParentIndex(int pos) {
        return pos / 2;
    }

    private int getLeftChildIndex(int pos) {
        return pos * 2;
    }

    private int getRightChildIndex(int pos) {
        return (pos * 2) + 1;
    }

    private void swap(int pos1, int pos2) {
        int tmp;
        tmp = heap[pos1];
        heap[pos1] = heap[pos2];
        heap[pos2] = tmp;
    }

    // Function to print the contents of the heap
    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + heap[i]
                    + " LEFT CHILD : " + heap[2 * i]
                    + " RIGHT CHILD :" + heap[2 * i + 1]);
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] arg)
    {
        System.out.println("The Min heap is ");
        Heap minHeap = new Heap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
        minHeap.print();

        System.out.println("The Min val is " + minHeap.remove());
    }
}
