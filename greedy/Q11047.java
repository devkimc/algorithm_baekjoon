package greedy;
//동전 0

import java.util.Scanner;

public class Q11047 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[i] = in.nextInt();
        }

        int answer = 0;

        for (int i = N - 1; i >= 0; i--) {
            if (coins[i] <= K) {
                answer += K / coins[i];
                K = K % coins[i];
            }
        }

        System.out.println(answer);
    }
}
