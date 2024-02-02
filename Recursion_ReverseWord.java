import java.util.Scanner;

public class Recursion_ReverseWord {
    public static String reverseString(String str){
        if(str.length() <= 1){
            return str;
        }
//        String revWord = "";
        String ans = reverseString(str.substring(1)) + str.charAt(0);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String :");
        String name= sc.nextLine();
        String ans = reverseString(name);
        System.out.println(ans);
    }
}
