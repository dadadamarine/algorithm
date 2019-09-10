package algo.data;

public class MinHeap2 {
    private int maxSize;
    private int size;
    private int[] datas;

    private static final int FRONT = 1;

    public MinHeap2(int maxSize) {
        this.maxSize = maxSize;
        size = 0;
        this.datas = new int[maxSize];
        datas[0] = Integer.MIN_VALUE;
    }

    public void push(int value) {
        //sizeCheck
        datas[++size] = value;
        int currentIndex = size;
        while (datas[currentIndex] < datas[getParentIndex(currentIndex)]) {
            swap(currentIndex, getParentIndex(currentIndex));
            currentIndex = getParentIndex(currentIndex);
        }
    }

    public int pop() {
        int poped = datas[FRONT];
        datas[FRONT] = datas[size--];
        minHeapify(FRONT);
        return poped;
    }

    private void minHeapify(int parentIndex) {
        if (isLeaf(parentIndex)) {
            return;
        }
        int leftChild = leftChild(parentIndex);
        int rightChild = rightChild(parentIndex);

        if (datas[parentIndex] < datas[leftChild]
                && datas[parentIndex] < datas[rightChild]) {
            return;
        }

        if (datas[parentIndex] > datas[leftChild]) {
            swap(parentIndex, leftChild);
            minHeapify(leftChild);
            return;
        }

        if(leftChild == size){
            return;
        }

        if (datas[parentIndex] < datas[rightChild]) {
            swap(parentIndex, rightChild);
            minHeapify(rightChild);
            return;
        }
    }

    private boolean isLeaf(int index) {
        if(index <= size && index>parent(size)){
            return true;
        }
        return false;
    }
}
