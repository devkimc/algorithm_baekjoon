package etc;

import java.util.Scanner;

public class Q10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int max = 0;
        int min = 0;

        for (int i = 1; i <= N; i++) {
            int num = in.nextInt();
            if(i == 1) {
                max =num;
                min =num;
            }
            if(num > max) max = num;
            if(num < min) min = num;
        }

        System.out.println(min);
        System.out.println(max);
    }
}
