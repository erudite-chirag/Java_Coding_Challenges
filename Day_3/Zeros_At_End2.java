package Day_3;
import java.util.*;

public class Zeros_At_End2 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter n");
        int n = ob.nextInt();
        int count=0,i;
    
        int arr[]=new int[n];
        System.out.println("Enter Elements");
        for(i=0;i<n-count;i++){
            arr[i]=ob.nextInt();
            if(arr[i]==0){
                count++;
                i--;
            }
        }
        for(;i<n;i++){
            arr[i]=0;
        }

        System.out.println("ARRAY");
        for(int j: arr){
            System.out.println(j);
        }
    }
}
