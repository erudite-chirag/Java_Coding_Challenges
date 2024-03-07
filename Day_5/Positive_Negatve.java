package Day_5;

public class Positive_Negatve {

    public static void main(String[] args) {
        int arr[] = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
        int n = arr.length;
        int pos[] = new int[n];
        int neg[] = new int[n];

        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0)
                pos[x++] = arr[i];
            else
                neg[y++] = arr[i];
        }
        int i = 0, j = 0, k = 0;
        while (i < x && j < y) {
            arr[k++] = pos[i++];
            arr[k++] = neg[j++];
        }

        while (i < x) {
            arr[k++] = pos[i++];
        }

        while (j < y) {
            arr[k++] = neg[j++];
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}