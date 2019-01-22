package algo.sort;

public class PivotSort {
    public static void main(String[] args){
        PivotSort ps = new PivotSort();
        int[] arr= {3,6,8,4,2,1};
        int end =arr.length;
        ps.pivotSort(arr, 0 , end-1);
        ps.printArr(arr);
    }

    void pivotSort(int[] arr, int start, int end){
        int pivotIndex=start;
        int pivot = arr[pivotIndex];
        int k=pivotIndex+1;
        for(int i=1; i <= end; i++){ // pivot 기준으로 정렬
            if(arr[i] < pivot){
                int temp = arr[k];
                arr[k]=arr[i];
                arr[i] = temp;
                k= k+1;
            }
        }
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[k-1];
        arr[k-1] = temp;
        pivotIndex = k-1;

        pivotSort(arr, start, pivotIndex-1);
        pivotSort(arr, pivotIndex, end);

    }



    void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
