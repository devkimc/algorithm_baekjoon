package etc;

import java.util.Arrays;
import java.util.Scanner;

public class Q2750 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] numbs = new int[N];

        for (int i = 0; i < N; i++) {
            numbs[i] = in.nextInt();
        }
        Arrays.sort(numbs);

        for (int i = 0; i < N; i++) {
            System.out.println(numbs[i]);
        }
    }
}
