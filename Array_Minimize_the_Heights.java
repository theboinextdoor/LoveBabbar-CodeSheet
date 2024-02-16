import java.util.*;

public class Array_Minimize_the_Heights {

    private static int getMinDiff(int[] arr, int n , int k){
        Arrays.sort(arr);

        int minDiff = arr[n-1]  - arr[0];
        int tempMin = arr[0];
        int tempMax= arr[n-1];

        for(int i=1; i<n ; i++){

            if(arr[i] -k < 0) continue;

            tempMin= Math.min(arr[0]+ k , arr[i] - k);
            tempMax = Math.max(arr[i-1], arr[n-1]- k);
            minDiff = Math.min(minDiff , tempMax - tempMin);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int[] arr = { 7, 4, 8, 8, 8, 9 };
        int k = 6;
        int ans = getMinDiff(arr, arr.length, k);
        System.out.println(ans);
    }
}
