package algo.sort;

public class QuickSort {
    // 세로의 줄 수 k가 log2n이기 때문에, 평균시간복잡도는 nLogn이다. 물론 최악은 n제곱 이지만.
    // 머지소트는 3* nlogn이라서 보통 퀵소트가 더 빠르다. https://gmlwjd9405.github.io/2018/05/08/algorithm-merge-sort.html

    public void sort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int pivotIndex = split(arr, low, high);
        sort(arr, low, pivotIndex - 1);
        sort(arr, pivotIndex + 1, high);
    }

    private int split(int[] arr, int low, int high) {
        int pivotIndex = selectPivot(arr, low, high);
        int pivot = arr[pivotIndex];
        int pointer = low;

        int temp = arr[high];
        arr[high] = arr[pivotIndex];
        arr[pivotIndex] = temp;
        pivotIndex =high;


        for (int i = low; i < high; i++) {
            if ( arr[i] < pivot) {
                temp = arr[pointer];
                arr[pointer] = arr[i];
                arr[i] = temp;
                pointer++;
            }
        }
        temp = arr[pointer];
        arr[pointer] = arr[pivotIndex];
        arr[pivotIndex] = temp;
        return pointer;
    }

    private int selectPivot(int[] arr, int low, int high) {
        return high;
    }


    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);

        System.out.println("sorted array");
        printArray(arr);
    }
}
