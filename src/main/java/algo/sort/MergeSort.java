package algo.sort;

public class MergeSort {
    public static void main(String[] args){
        MergeSort ms = new MergeSort();
        int[] arr= {3,6,8,4,2,1};
        ms.mergeSort(arr, 0 , arr.length -1);
        ms.printArr(arr);
    }
    void mergeSort(int[] arr, int start, int end){

        int mid = (start + end) / 2;
        if(end > start){
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);

            merge(arr, start, mid, end);
        }
    }

    void merge(int[] arr ,int start, int mid, int end){

        int i,j,k;
        int[] left =new int[mid - start+1];
        int[] right = new int[end - mid];
        for(i=0; i<left.length;i++){
            left[i] =arr[i];
        }
        for(i=0; i<right.length; i++){
            right[i] = arr[i+mid+1];
        }

        for(i=0, j= 0, k = 0; i<= left.length-1 && j<= right.length - 1; ){
            if(left[i]<right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }

        if(i <= left.length - 1){
            for(; j<= right.length-1; j++){
                arr[k++] = right[j++];
            }
        }
        if(j <= right.length - 1){
            for(; i<= left.length-1; i++){
                arr[k++] = left[i++];
            }
        }
        System.out.print("병합결과 : " );
        printArr(arr);
    }

    void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
