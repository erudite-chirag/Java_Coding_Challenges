package Day_4;
import java.util.*;

public class Rotate_Array3 {
    public static void reverseArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        Collections.reverse(list);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {-4, -3, -1, 4, 5, 7};
        int n = arr.length;
        int d = 2;
        int temp;

        reverseArray(arr);

        // 1st half
        for(int i=0;i<(n-d)/2;i++){
            temp=arr[i];
            arr[i]=arr[n-d-i-1];
            arr[n-d-i-1]=temp;
        }

        //2nd half
        for(int i=n-d;i<((n-d)+d/2);i++){
            temp=arr[i];
            arr[i]=arr[i+d-1];
            arr[i+d-1]=temp;
        }
 
        // Print the reversed array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}