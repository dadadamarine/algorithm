package algo.sort;

public class SelectionSort {
    public static void main(String[] args){
        SelectionSort ss = new SelectionSort();
        int[] arr= {3,6,8,4,2,1};
        ss.sort(arr);
        ss.printArr(arr);
    }
    void sort(int[] arr){
        for(int i = 0; i< arr.length-1; i++){
            int selectedIndex = i;
            for(int j = i+1 ; j<arr.length; j++){
                if(arr[selectedIndex] > arr[j]){
                    selectedIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[selectedIndex];
            arr[selectedIndex] = temp;
        }
    }
    void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
