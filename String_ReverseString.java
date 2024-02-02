public class String_ReverseString {
    public static void main(String[] args) {
        String str = "Geeks";
        String rS= "";
        for(int i=0 ; i<str.length() ; i++){
            rS = str.charAt(i) + rS;
        }

        System.out.println(rS);
    }
}
