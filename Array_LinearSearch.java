import java.util.ArrayList;

public class Array_LinearSearch
{
    public static void main(String[] args){
       int[] arr= {3,7,2,7,1,7,7};
       int searchElem = 7;

//       Making the array List to contain the index where the given search elem. is present
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length ; i++){
            if(arr[i] == searchElem){
                list.add(i);
            }
        }

        System.out.print("Element is present at index: ");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
