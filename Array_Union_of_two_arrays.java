import java.util.HashSet;

public class Array_Union_of_two_arrays {

    private static int doUnion(int[] arr, int[] brr){
        HashSet<Integer> hash = new HashSet<>();
        for(int i: arr) hash.add(i);
        for(int j : brr) hash.add(j);
        return hash.size();
    }
    public static void main(String[] args) {
        int[] a = {85,25,1,32,54,6};
        int[] b = {85, 2};

        int ans = doUnion(a, b);
        System.out.println(ans);
    }
}
