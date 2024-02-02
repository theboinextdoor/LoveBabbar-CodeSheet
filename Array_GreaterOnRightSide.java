import java.util.Scanner;

public class Array_GreaterOnRightSide {
    private static void GreaterOnRightSide(int[] arr, int n){
        int temp = arr[n-1];
        arr[n-1] = -1;


        for(int i=n-2; i>=0 ; i--){
            int maximumNum = Math.max(temp , arr[i+1]);
            temp = arr[i];
            arr[i] = maximumNum;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr= new int[size];
        System.out.println("Enter the element inside the array: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        GreaterOnRightSide(arr, size);
        System.out.println("Resultant Array is: ");
        for(int i=0 ; i<size ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
