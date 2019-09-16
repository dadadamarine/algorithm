package algo.data2;

public class MaxHeap2 {

    private int size;
    private int maxSize;
    private int[] maxHeap;

    private final int FRONT = 1;

    public MaxHeap2(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.maxHeap = new int[maxSize];
        this.maxHeap[0] = Integer.MAX_VALUE;
    }

    public void push(int value) {
        if (size >= maxSize) {
            return;
        }
        maxHeap[++size] = value;
        int currentIndex = size;
        while (maxHeap[currentIndex] > maxHeap[getParentIndex(currentIndex)]) {
            swap(currentIndex, getParentIndex(currentIndex));
            currentIndex = getParentIndex(currentIndex);
        }
    }

    private void swap(int currentIndex, int parentIndex) {
        int temp = maxHeap[currentIndex];
        maxHeap[currentIndex] = maxHeap[parentIndex];
        maxHeap[parentIndex] = temp;
    }

    private int getParentIndex(int index) {
        return index / 2;
    }

    public int pop() {
        int result = maxHeap[FRONT];
        maxHeap[FRONT] = maxHeap[size--];
        maxHeapify(FRONT);
        return result;
    }

    private void maxHeapify(int index) {
        if (isLeaf(index)) {
            return;
        }
        int leftChildIndex = getLeftChildIndex(index);
        int rightChildIndex = getRightChildIndex(index);

        if (hasSingleChild(index)) {
            if(maxHeap[index] > maxHeap[leftChildIndex]){
                return;
            }
            swap(leftChildIndex, index);
        }

        if (maxHeap[index] > maxHeap[leftChildIndex] && maxHeap[index] > maxHeap[rightChildIndex]) {
            return;
        }

        if (maxHeap[leftChildIndex] < maxHeap[rightChildIndex]) {
            swap(rightChildIndex, index);
            maxHeapify(rightChildIndex);
            return;
        } else {
            swap(leftChildIndex, index);
            maxHeapify(leftChildIndex);
        }
    }

    private boolean hasSingleChild(int index) {
        return getLeftChildIndex(index) == size;
    }

    private boolean isLeaf(int index) {
        if (index > size ) {
            return false;
        }
        if(index <= getParentIndex(size)){
            return false;
        }
        return true;
    }

    private int getLeftChildIndex(int index) {
        return index * 2;
    }


    private int getRightChildIndex(int parent) {
        return parent * 2 + 1;
    }


    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + maxHeap[i]
                    + " LEFT CHILD : " + maxHeap[2 * i]
                    + " RIGHT CHILD :" + maxHeap[2 * i + 1]);
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] arg) {
        System.out.println("The Max heap is ");
        MaxHeap2 maxHeap = new MaxHeap2(15);
        maxHeap.push(5);
        maxHeap.push(3);
        maxHeap.push(17);
        maxHeap.push(10);
        maxHeap.push(84);
        maxHeap.push(19);
        maxHeap.push(6);
        maxHeap.push(22);
        maxHeap.push(9);
        maxHeap.print();

        System.out.println("The Max val is " + maxHeap.pop());
    }
}
