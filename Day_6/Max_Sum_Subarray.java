package Day_6;

public class Max_Sum_Subarray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -2, 5 };
        int n = arr.length;
        int curr = 0;
        int max = -1;

        for (int i = 0; i < n; i++) {
            if (curr < 0) {
                curr = arr[i];
            } else {
                curr = curr + arr[i];
            }
            if (curr > max) {
                max = curr;
            }
        }
        if (max == -1) {
            max = arr[0];
            for (int i = 0; i < n; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }
        System.out.println(max);
    }

}
