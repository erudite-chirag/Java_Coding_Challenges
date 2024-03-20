package Day_7;

public class Atoi {
    public static void main(String[] args) {
        String s = "-123";
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum = sum * 10 + (int) (s.charAt(i) - '0');
            } else if (i == 0 && s.charAt(0) == '-') {
                flag = true;
            } else {
                System.out.println(-1);
            }
        }
        if (flag) {
            sum = 0 - sum;
        }
        System.out.println(sum);
    }
}
