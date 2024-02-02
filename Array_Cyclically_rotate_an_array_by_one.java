public class Array_Cyclically_rotate_an_array_by_one {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        System.out.println("Elements Before Rotation : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        int temp = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        System.out.println("");
        System.out.println("Elements After Rotation : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
