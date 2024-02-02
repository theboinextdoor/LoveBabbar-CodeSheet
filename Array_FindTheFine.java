import java.util.Scanner;

public class Array_FindTheFine {
    private static int totalFine(int size, int[] car , int[] fine, int date){
        int totalFine= 0;
        if(date % 2 == 0){
            for(int i=0; i<size; i++){
                if(car[i] % 2 !=0){
                    totalFine +=fine[i];
                }
            }
        }else{
            for(int j=0; j<size; j++){
                if(car[j] % 2 == 0){
                    totalFine+=fine[j];
                }
            }
        }

        return totalFine;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dateL ");
        int date = sc.nextInt();
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int car[] = new int[size];
        int fine[] = new int[size];
        System.out.println("Enter the car number : ");
        for(int i=0; i<size; i++){
            car[i] = sc.nextInt();
        }

        System.out.println("Enter the fine of the car: ");
        for(int i=0; i<size; i++){
            fine[i] = sc.nextInt();
        }

        int ans = totalFine(size, car, fine, date);
        System.out.println("Total Fine is: "+ ans);
    }
}
