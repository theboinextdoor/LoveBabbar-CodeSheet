import java.util.Scanner;

public class Array_MissingElemOfAP {
    private static int findELem(int[] arr , int length){
        if(arr.length == 0) return 0;

        int commonDiff = (arr[length -1 ] - arr[0])/length;
        int left = 0;
        int right = length - 1;

        while(left < right){
            int mid = left+((right - left)/2);

            if(arr[mid+1] - arr[mid] !=commonDiff){
                return arr[mid] + commonDiff;
            }

            if(arr[mid] - arr[mid-1] != commonDiff){
                return arr[mid]- commonDiff;
            }

            if(arr[mid] != (arr[0] + mid * commonDiff)){
                right= mid-1;
            }else{
                left = mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size= sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the element inside the array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(i+":");
            arr[i] = sc.nextInt();
        }

        int ans = findELem(arr , arr.length);
        if(ans != -1){
            System.out.print("Missing Element is: "+ ans);
        }else{
            System.out.print("AP is completely ok");
        }
    }
}
