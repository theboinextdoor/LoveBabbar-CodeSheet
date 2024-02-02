public class Array_MergeAllNegativeNumber {

    private static int[] segregateElem(int[] arr){
        int count = 0;
        int[] ans = new int[arr.length];

        for(int i=0; i<arr.length ; i++){
            if(arr[i] > 0){
                ans[count++] = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                ans[count++] = arr[i];
            }
        }

        for(int i=0; i<ans.length ; i++){
            arr[i] = ans[i];
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr=  {-5, 7, -3, -4, 9, 10, -1, 11};
        int[] ans= segregateElem(arr);

        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }

    }
}
