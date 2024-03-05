package Day_3;
import java.util.*;

public class Zeros_At_End {

    public static void ZeroShift(int[] arr, int n){
        
        for(int i =n-1;i>=0;i--){
            if(arr[i]==0){
                for(int j=i;j<n-1;j++){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of Elements");
        int n=ob.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter Elements");
        for(int i =0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        ZeroShift(arr,n);

        for(int i: arr){
            System.out.print(i+" ");
        }

        ob.close();
    }
}