package etc;

import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        String strB = String.valueOf(B);

        System.out.println(Character.getNumericValue(strB.charAt(2)) * A);
        System.out.println(Character.getNumericValue(strB.charAt(1)) * A);
        System.out.println(Character.getNumericValue(strB.charAt(0)) * A);
        System.out.println(A * B);
    }
}
