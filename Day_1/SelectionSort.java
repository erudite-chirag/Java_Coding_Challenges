package Java_Assignments.Day_1;
import java.util.*;
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        // One by one move boundary of unsorted sub-array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element
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
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        ob.close();
    }
}
