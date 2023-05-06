package etc;

import java.util.Arrays;
import java.util.Scanner;

public class Q2920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbs = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] ascending = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] descending = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.equals(numbs, ascending) ? "ascending" : (Arrays.equals(numbs, descending) ? "descending" : "mixed"));
    }
}
