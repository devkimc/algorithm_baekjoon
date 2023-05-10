package etc;

import java.util.Arrays;
import java.util.Scanner;

public class Q2587 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbs = new int[5];
        int average = 0;

        for (int i = 0; i < 5; i++) {
            numbs[i] = in.nextInt();
            average += numbs[i];
        }
        Arrays.sort(numbs);
        average /= 5;

        System.out.println(average);
        System.out.println(numbs[2]);
    }
}
