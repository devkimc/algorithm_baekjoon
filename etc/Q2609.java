package etc;

import java.util.Scanner;

public class Q2609 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int max = Math.max(A, B);
        if (A == 1 || B == 1) {
            System.out.println(1);
            System.out.println(A*B);
            return;
        }

        for (int i = max/2; i > 1; i--) {
            if (A % i == 0 && B % i == 0) {
                System.out.println(i);
                System.out.println(A * B / i);
                return;
            }
        }
    }
}
