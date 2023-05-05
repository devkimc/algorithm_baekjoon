package etc;

import java.util.Arrays;
import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        String num = in.nextLine();
        System.out.println(Arrays.stream(num.split("")).mapToInt(Integer::parseInt).sum());
    }
}
