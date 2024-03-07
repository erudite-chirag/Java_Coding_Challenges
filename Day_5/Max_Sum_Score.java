package Day_5;

public class Max_Sum_Score {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 1, 5, 6 };
        int n = arr.length;
        long max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i - 1] + arr[i]);
        }
        System.out.println(max);

    }
}