package etc;

import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int A = in.nextInt();
            int B = in.nextInt();
            if(A+B == 0) return;
            System.out.println(A + B);
        }
    }
}
