package etc;

import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        int time = in.nextInt();

        m += time;
        if(m >= 60) {
            h += m / 60;
            m %= 60;
        }

        if(h >= 24) h %= 24;

        System.out.println(h);
        System.out.println(m);
    }
}
