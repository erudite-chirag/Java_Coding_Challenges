package Day_3;

public class Pascals_Triangle {
    public static void main(String[] args) {
        int i,j,k;
        int n=6;          
        for (i = 0; i < n; i++) {
            for(k=n;k>i;k--){
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + " ");
            }
            System.out.println();
        }
    }
    
    // Function to calculate binomial coefficient
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n)
            return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
    }
