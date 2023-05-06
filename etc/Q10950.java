package etc;

import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(in.nextInt()+in.nextInt());
        }

    }
}
