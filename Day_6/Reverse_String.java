package Day_6;

public class Reverse_String {

    public static void main(String[] args) {
        String s = "Hello.World.Hey.This.World";
        String s2 = "", s3 = "";
        int l = s.length();

        for (int i = l - 1; i >= 0; i--) {
            if (s.charAt(i) != '.') {
                s2 += s.charAt(i);
            } else {
                s3 += new StringBuilder(s2).reverse().toString() + ".";
                s2 = "";
            }
        }
        s3 += new StringBuilder(s2).reverse().toString();
        s2 = "";
        System.out.println(s3);
    }
}