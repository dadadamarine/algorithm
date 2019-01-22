import java.util.Scanner;
import java.util.Arrays;
//조건: 숫자 갯수 L, 집합, N
// key : 집합의 수로 가장 작은 크기로 n을 포함하는 두 숫자를 고름
// 그 숫자 a b (a<b) 로 b-1 - (a+1) + 1 을 구함.

/*
    main(){
        - 입력받는거 처리
        - n과 가장 가까운 배열의 두수 고름
            - getClosetRightIndex(int[] arr);
                - 0보다 크고, 최소인애를 골라야함 // left는 0보다 작고 최대인애

                - index = 0;
                - for(arr.len)
                - if(n-arr[i] >= 0 && n-arr[i] > n - arr[0] ){

                }
            - getClosetLeftIndex();
        - if 그 두 수가 n과 같을 경우 0을 출력
        - else b-a-1 출력
    }



 */

public class Main {
    final int MAX = 10000;
    final int MIN = -10000;
    public static void main(String[] args) {
        Main ma = new Main();
        Scanner scanner= new Scanner(System.in);
        int l = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[l];
        for(int i =0; i<l; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        scanner.nextLine();
        int n = scanner.nextInt();

        int left = ma.getClosetLeftIndex(arr , n, l);
        int right = ma.getClosetRightIndex(arr, n , l);
        int leftValue;
        if(left == -1){
            leftValue = 0;
        }else{
             leftValue= arr[left];
        }
        int rightValue = arr[right];
        //System.out.println(left);
        //System.out.println(right);
        if(leftValue == n || rightValue == n) {
            System.out.println(0);
        }else{
            System.out.println(ma.combination(leftValue+1, rightValue-1, n));
        }
    }

    public int combination(int l, int r, int n) {
        int combinationLeft = n-l+1;
        int combinationRight = r-n+1;

        return combinationLeft * combinationRight -1;
    }

    int getClosetRightIndex(int[] arr, int n, int l){
        int index=-1;
        int value = MAX;
        for(int i=0; i<l; i++){
            if(arr[i]-n >= 0 && arr[i]-n <= value){
                //오른쪽 : 0보다 큰 최소
                value= arr[i]-n;
                index = i;
            }
        }
        return index;
    }

    int getClosetLeftIndex(int[] arr, int n, int l){
        int index=-1;
        int value = MIN;
        for(int i=0; i<l; i++){
            if(arr[i] -n <= 0 && arr[i] -n >= value){
                value = arr[i]-n;
                index = i;
            }
        }
        return index;
    }

}

