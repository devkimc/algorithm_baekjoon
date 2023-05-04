package etc;

import java.util.Scanner;

public class Q1330 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();

        if(m < 45) {
            m += 15;
            if(h == 0) {
                h = 23;
            } else {
                h -= 1;
            }
        } else {
            m -= 45;
        }
        System.out.println(h);
        System.out.println(m);
    }
}
