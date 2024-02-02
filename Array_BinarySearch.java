import java.util.Arrays;

public class Array_BinarySearch {

    private static int search(int[] arr, int length , int searchElem) {
        Arrays.sort(arr);
        int left = 0;
        int right = length - 1;

//        [1,2,4,6,8,9]
        while(left <= right){
            int mid = left + ((right - left)/2);
            if(arr[mid] == searchElem){
                return mid;
            }else if(arr[mid] > searchElem){
                right = mid-1;
            }else if(arr[mid] < searchElem){
                left = mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {6,2,8,1,9,4};
        int searchElem = 10;
        int ans = search(arr, arr.length , searchElem);
        if(ans != -1){
            System.out.println("Element is present at: "+ ans);
        }else{
            System.out.println("Element is not present inside the array");
        }
    }


}
