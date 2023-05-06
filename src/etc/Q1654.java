package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] numbs = new int[K];

        for (int i = 0; i < K; i++) {
            numbs[i] = Integer.parseInt(br.readLine());
        }

        int maxLen = Arrays.stream(numbs).sum() / N;
        while (true) {
            int count = 0;
            for (int z = 0; z < K; z++) {
                count += numbs[z] / maxLen;
            }
            if(count == N) {
                System.out.println(count);
                break;
            }
            maxLen--;
        }
    }
}
