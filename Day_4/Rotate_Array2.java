package Day_4;

public class Rotate_Array2 {
    public static void main(String[] args) {
        int arr[]={2,3,7,8,5,6,4};
        int n=arr.length;
        int d=2;
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[(i + n - d) % n] = arr[i];
        }
        for(int i: arr2){
            System.out.print(i+" ");
        }
    }
    
}
