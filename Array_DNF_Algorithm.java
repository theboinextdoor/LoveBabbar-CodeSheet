import java.util.Scanner;

public class Array_DNF_Algorithm {
    private static int[] takeInput(int size){
        System.out.println("Enter the element inside the array (only 0, 1 & 2): ");
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.print(i+": ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    private static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int[] Dutch_National_Flag(int[] arr){
        int low= 0;
        int mid= 0;
        int high= arr.length - 1;
        int temp= 0;

        while(mid <= high){
            switch(arr[mid]){
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp ;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2 : {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp ;
                    high--;
                    break;
                }
            }
        }

        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr= takeInput(size);
        System.out.println("Array before the sorting: " );
        printArray(arr);
        System.out.println("Array after the sorting : " );
        int[] ans = Dutch_National_Flag(arr);
        printArray(ans);
    }
}
