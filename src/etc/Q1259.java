package etc;

import java.util.Scanner;

public class Q1259 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isEnd = false;
        while (!isEnd) {
            String str = Integer.toString(in.nextInt());
            if(str.equals("0")) {
                isEnd = true;
                return;
            }

            StringBuffer sb = new StringBuffer(str);
            String reverse = sb.reverse().toString();
            if (str.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
