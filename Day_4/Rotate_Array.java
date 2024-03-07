package Day_4;

public class Rotate_Array {
    public static void main(String[] args) {
        int arr[]={2,3,7,8};
        int n=arr.length;
        int d=3,k=0;
        int temp1=arr[0];
        for(int i=0;i<n;i++){
            if(i<d){
                int temp=arr[i];
                arr[i]=arr[n-k+i-d];
                arr[n-k+i-d]=temp;
            }
            if(i>=d){
                k=n;

            }

            
        }

        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
