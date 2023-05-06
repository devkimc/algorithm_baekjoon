package etc;

import java.util.Arrays;
import java.util.Scanner;

public class Q3052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] remainders = new int[10];
        for (int i = 0; i < 10; i++) {
            remainders[i] = in.nextInt() % 42;
        }
        System.out.println(Arrays.stream(remainders).distinct().toArray().length);
    }
}
