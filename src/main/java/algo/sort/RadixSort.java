package algo.sort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args){
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        int n = arr.length;
        radixSort(arr, n);
        print(arr, n);
    }
    static int getMax(int arr[] , int n){
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    };

    static void countSort(int arr[] ,int n, int exp){
        // exp 자리수를 기준으로 정렬시킴.
        /*
            - key : ( value / exp ) % 10 사용, 뜻: exp자리의 값
            - output 배열 생성, count 배열 생성,
            - count 정렬로 각 자리수의 개수를 셈
            - count 정렬 재정의 : index에 해당하는 값 이전에 숫자들이 몇개 있는지
                - 이걸 통해서 index에 해당하는 값이 어디 들어가야 하는지 알 수 있음.
                - 값을 넣어준 다음 count[index]를 -- 하든지 ++ 하든지 해서 자리 변환
                    -output[ count[ (arr[i]/exp) % 10 ]-- ];
        * */


        int[] output = new int[n];
        int[] count = new int[10];
        for(int i=0; i<n; i++){
            //exp자리수에 해당하는 값의 개수를 구함
            // exp자리수가 4인 애들의 수는 count[4];
            count[(arr[i]/exp)%10]++;
        }

        for(int i=1; i<10; i++){
            // 이 애가 어디로 들어가야하는지(exp값을 이걸로 가지는 이애는 어디로 가야하는지 ) 정하는 배열 count를 만듬
            // arr[4]가 들어갈 곳은, count[(arr[4]/exp)%10]
            count[i] += count[i-1];
            // count[4]에는 count 3까지의 합이 모두 포함된것 + exp자리수가 4가 나오는 애들의 개수가 있음
            // 따라서 입력하고 -- 를 해주면 된다
            // 뒤에서 부터 입력하기 때문에, 큰게 뒤로 정렬됨.
        }

        for(int i=n-1; i>=0; i--){
//            System.out.println("ㅇ멍정");
//            System.out.println(i);
//            System.out.println((arr[i]/exp) % 10);
//            System.out.println(count[ (arr[i]/exp) % 10 ]);
            output[ count[ (arr[i]/exp) % 10 ] - 1 ] = arr[i];
            count[ (arr[i]/exp) % 10 ]--;
        }

        System.arraycopy(output,0,arr,0,n);
        // print(arr, n );
        /*
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[ (arr[i]/exp)%10 ]++;
        System.out.println("첫번째");
        print(count,n);
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
        System.out.println("두번째");
        print(count,n);

        // Build the output array
        for (i = n - 1; i >= 0; i--)
        {
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
        System.out.println("정렬 후");
        print(arr,n);
        */
    }
    static void radixSort(int arr[], int n){
        //자리수 별로 정렬을 시킴,
        /*
            - 최대 자리수의 기준이 될 max값을 구함.
            - max자리수가 될때까지 for문 돌면서 countSort 메서드 실행
        */
        int max = getMax(arr, n);
        for(int exp =1; max/exp > 0 ; exp *= 10){
            countSort(arr, n, exp);
        }
    };

    static void print(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(""+arr[i] + " ");
        }
        System.out.println("");
    };






}
