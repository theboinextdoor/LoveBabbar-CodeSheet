public class Array_Move_all_negative_elements_to_end {

    private static int[] segregateElements(int[] arr, int n){
        int[] ans = new int[n];
        int count = 0;

//        for all the positive number
        for(int i=0; i<n ; i++){
            if(arr[i] > 0){
                ans[count++] = arr[i];
            }
        }

//        for all the negative number
        for(int i=0; i<n ; i++){
            if(arr[i] < 0){
                ans[count++] = arr[i];
            }
        }

//        Copying all the element
        for(int i=0; i<n ; i++){
            arr[i] = ans[i];
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr =  {1, -1, 3, 2, -7, -5, 11, 6 };
        int[] ans = segregateElements(arr, arr.length);
        for(int i=0; i<arr.length ; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
