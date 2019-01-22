package algo.sort;

public class InsertionSort {

    public static void main(String[] args){
        InsertionSort is = new InsertionSort();
        int[] arr= {3,6,8,4,2,1};
        is.sort(arr);
        is.printArr(arr);
    }

    void sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int index = i;
            int indexValue = arr[i];
            int j = i-1; // key 이전값부터 비교시작
            while(j>=0 && indexValue < arr[j]) {
                //System.out.println("비교! "+ arr[index] + "<" + arr[j]);

                arr[j + 1] = arr[j]; // 비교하면서 오른쪽으로  밀어내기
                j--;
            }
            //System.out.println("j값 : "+ j);
            arr[j+1] = indexValue;
            //printArr(arr);
            //System.out.println("");
        }
    }

    void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
