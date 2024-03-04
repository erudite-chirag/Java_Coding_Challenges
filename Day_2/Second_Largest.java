package Day_2;
import java.util.*;
public class Second_Largest {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=ob.nextInt();
        int[] arr =  new int[n];
        System.out.println("Enter Elements");
        for(int i =0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        selectionSort(arr);
        System.out.println("Second Largest Element is "+ arr[n-2]);
        
        ob.close();
    }
}
