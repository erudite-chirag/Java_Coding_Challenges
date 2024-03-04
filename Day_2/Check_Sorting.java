package Day_2;
import java.util.*;
public class Check_Sorting {

    public static void checkSorting(int[] arr, int n){
        boolean flag = true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Not sorted");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Sorted Array");
        }
        
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number of Elements");
        int n = ob.nextInt();

        System.out.println("Enter Array Elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        checkSorting(arr,n);

        ob.close();
    }
}
