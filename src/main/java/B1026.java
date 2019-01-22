//import java.util.Scanner;
//
///* key : 최소가 나오게 A를 재배열
//
//- B의 원소중 최소인것에 최대를 갖다 대야함
//    - A, B 배열 복사, A' B'
//    - 반복 (n번)
//        - B'중 최소가 되는 원소의 인덱스 를 탐색& 리턴 후 삭제( MAX 삽입) , arrayList 사용, bIndex
//        - 그 인덱스 번호에 A의 최대값 매칭.
//            - A'의 최대값 가져오기 , arrayList사용 , maxAValue
//            - 해당 A'의 원소 A'배열에서 삭제( MIN 삽입)
//            - 원본배열 A[bIndex] = maxAValue;
//- int max = multiply(A, B);
//- print(max)
//*/
//
//public class Main {
//
//    final static int MAX = 1000;
//    final static int MIN = -1;
//    public static void main(String[] args) {
//        Main mClass = new Main();
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        int[] a = mClass.stringToIntArr(scanner.nextLine());
//        int[] b = mClass.stringToIntArr(scanner.nextLine());
//        int[] aCopy = new int[n];
//        int[] bCopy = new int[n];
//        System.arraycopy(a,0,aCopy,0, n);
//        System.arraycopy(b,0,bCopy,0, n);
//        for(int i=0; i<n; i++){
//            int bIndex = mClass.getMaxIndex(bCopy);
//            int aIndex = mClass.getMinIndex(aCopy);
//            int aValue = aCopy[aIndex];
//            a[bIndex] = aValue;
//            bCopy[bIndex] = MIN;
//            aCopy[aIndex] = MAX;
//        }
//        //mClass.print(a);
//        //mClass.print(b);
//        System.out.println(mClass.multiplyArr(a, b));
//
//    }
//
//    int multiplyArr(int[] a, int[] b) {
//        int result = 0;
//        for(int i=0; i<a.length; i++){
//            result += a[i] * b[i];
//        }
//        return result;
//    }
//
//    int[] stringToIntArr(String str){
//        int size = str.split(" ").length;
//        int[] result = new int[size];
//        int i = 0;
//        for(String num: str.split(" ")){
//            result[i++] = Integer.parseInt(num);
//        }
//        return result;
//    }
//
//    void print(int[] arr){
//        for(int i=0; i<arr.length; i++){
//            System.out.print(""+arr[i]+" ");
//        }
//        System.out.println(" ");
//    }
//    int getMaxIndex(int[] arr){
//        int index=0;
//        for(int i=1; i<arr.length; i++){
//            if(arr[index] < arr[i]){
//                index = i;
//            }
//        }
//        return index;
//    }
//    int getMinIndex(int[] arr){
//        int index=0;
//        for(int i=1; i<arr.length; i++){
//            if(arr[index] > arr[i]){
//                index = i;
//            }
//        }
//        return index;
//    }
//}
//
