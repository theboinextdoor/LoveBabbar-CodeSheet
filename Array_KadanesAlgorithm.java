import java.util.Scanner;
public class Array_KadanesAlgorithm {
    private static int kadanseAlgo(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];

            if(currSum > maxSum){
                maxSum = currSum;
            }

            if(currSum < 0){
                currSum = 0;
            }
        }
        return currSum;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements inside the array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int ans  = kadanseAlgo(arr);
        System.out.println("Longest sum of Subarray: ");
        System.out.println(ans);

    }
}
