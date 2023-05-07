package etc;

import java.util.Scanner;

public class Q1978 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        int answer = 0;
        for (int i = 0; i < N; i++) {
            int num = in.nextInt();
            if(chkDecimal(num)) answer++;
        }

        System.out.println(answer);
    }

    public static boolean chkDecimal(int num) {
        if(num == 1) return false;
        for (int z = 2; z <= Math.sqrt(num); z++) {
            if(num % z == 0) return false;
        }
        return true;
    }
}
