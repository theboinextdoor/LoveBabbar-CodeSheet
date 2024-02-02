import java.util.Scanner;

public class Matrix_Search_Elem {

    public static int[][] takeInput(int row , int col){
        Scanner sc= new Scanner(System.in);
        int[][] ans = new int[row][col];
        System.out.println("Enter the Element inside the Array: ");
        for(int i=0; i<row ; i++){
            System.out.println("Row number: "+ i);
            for(int j=0; j<col ; j++){
                System.out.print("Columnn number "+j+": ");
                ans[i][j] = sc.nextInt();
            }
        }
        return ans;
    }

    public static void printMatrix(int[][] arr){
        int row = arr.length ;
        int col = arr[0].length;

        for(int i=0; i<row ; i++){
            for(int j=0; j<col ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static boolean searchElement(int[][] arr, int targetElem){
        int row = arr.length ;
        int col = arr[0].length;

        for(int i=0; i<row ; i++){
            for(int j=0; j<col ; j++){
              if(arr[i][j]== targetElem){
                  return true;
              }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int row = sc.nextInt();

        System.out.print("Enter the size of the col: ");
        int col = sc.nextInt();
        int[][] arr= takeInput(row, col);
        printMatrix(arr);
        System.out.println("Enter the element to search: ");
        int searchingElem = sc.nextInt();
        boolean ans = searchElement(arr, searchingElem);
        System.out.println(ans);
    }
}
