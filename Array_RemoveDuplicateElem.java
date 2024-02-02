import java.util.Arrays;
import java.util.Scanner;

public class Array_RemoveDuplicateElem {
    private  static int removeDuplicate(int[] arr, int size){
        Arrays.sort(arr);
        int count = 1;

        for(int i=1; i<size ; i++){
            if(arr[i] != arr[i-1]){
                arr[count] = arr[i];
                count++;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the element of an array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int ans= removeDuplicate(arr, size);
        System.out.println(ans);
    }
}
