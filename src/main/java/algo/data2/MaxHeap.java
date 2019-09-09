package algo.data2;

import java.awt.print.Pageable;

public class MaxHeap {

    private int[] heap;
    int size;
    int maxSize;

    private final int FRONT = 1;

    public MaxHeap(int maxSize) {
        heap = new int[maxSize];
        size = 0;
        this.maxSize = maxSize;
        heap[0] = Integer.MIN_VALUE;
    }

    public int pop() {
        int result = heap[FRONT];
        heap[FRONT] = heap[size--];
        maxHeapify(FRONT);
        return result;
    }

    private void maxHeapify(int index) {
        if (isLeaf(index)) {
            return;
        }
        int leftChildIndex = leftChildIndex(index);
        int rightChildIndex = rightChildIndex(index);
        if (heap[index] > heap[leftChildIndex] && heap[index] > heap[rightChildIndex]) {
            return;
        }
        if (leftChildIndex > rightChildIndex) {
            swap(index, leftChildIndex(index));
            maxHeapify(leftChildIndex);
            return;
        } else {
            swap(index, leftChildIndex(index));
            maxHeapify(leftChildIndex);
        }
    }

    private boolean isLeaf(int index) {
        if (index <= size && index > getParentIndex(size)) {
            return true;
        }
        return false;
    }

    private int rightChildIndex(int index) {
        return index * 2 + 1;
    }

    private int leftChildIndex(int index) {
        return index * 2;
    }

    public void push(int data) {
        if (size > maxSize) {
            return;
        }
        heap[++size] = data;
        int currentIndex = size;
        while (heap[currentIndex] > heap[getParentIndex(currentIndex)]) {
            swap(currentIndex, getParentIndex(currentIndex));
            currentIndex = getParentIndex(currentIndex);
        }

    }

    private void swap(int currentIndex, int parentIndex) {
        int temp = heap[currentIndex];
        heap[currentIndex] = heap[parentIndex];
        heap[parentIndex] = temp;
    }

    private int getParentIndex(int size) {
        return size / 2;
    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + heap[i]
                    + " LEFT CHILD : " + heap[2 * i]
                    + " RIGHT CHILD :" + heap[2 * i + 1]);
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] arg) {
        System.out.println("The Min heap is ");
        MaxHeap maxHeap = new MaxHeap(15);
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

        System.out.println("The Min val is " + maxHeap.pop());
    }
}
