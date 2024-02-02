import java.util.Scanner;

public class String_String_with_numbers_at_its_end {

    private static int checkString(String str){
        int charLen = 0;
        int numLen = 0;

        for(int i=0; i<str.length(); i++){

            if(Character.isLetter(str.charAt(i))){
                charLen++;
            }

            if(Character.isDigit(str.charAt(i))){
                numLen = (numLen * 10) + (str.charAt(i) - '0');
            }
        }
        return charLen == numLen ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int ans = checkString(str);
        System.out.println(ans);
    }
}
