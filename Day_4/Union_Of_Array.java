package Day_4;

public class Union_Of_Array {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,8,10};
        int arr2[]={2,3,6};
        int x1=arr1.length, y1= arr2.length;
        int arr3[]=new int[x1+y1];
        int k=0;
        // int n=y1>x1?y1:x1;
        int x=0,y=0;
        
        for(int i=0;i<x1+y1;i++){
            if(x<x1&&y<y1&&arr1[x]==arr2[y]){
                arr3[i]=arr2[y];
                y++;x++;
                k++;
            }
            else if((x==x1&&y<y1)||(y<y1&&arr1[x]>arr2[y])){
                arr3[i]=arr2[y];
                y++;
                k++;
            }
            else if((y==y1&&x<x1)||(x<x1&&arr1[x]<arr2[y])){
                arr3[i]=arr1[x];
                x++;
                k++;
            }
        }

        for(int i=0;i<k;i++){
            System.out.println(arr3[i]);
        }

    }
    
}
