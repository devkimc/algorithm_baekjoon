package etc;
//분수찾기

import java.util.Scanner;

public class Q1193 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();

        int line = 1;
        while (line < X) {
            X -= line;
            line++;
        }

        System.out.println(line % 2 == 0 ? X + "/" + (line + 1 - X) : (line + 1 - X) + "/" + X);
    }
}
