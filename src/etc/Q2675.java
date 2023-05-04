package etc;

import java.util.Scanner;

public class Q2675 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            String answer = "";
            int R = in.nextInt();
            String S = in.next();
            for (int z = 0; z < S.length(); z++) {
                answer += String.valueOf(S.charAt(z)).repeat(R);
            }
            System.out.println(answer);
        }
    }
}
