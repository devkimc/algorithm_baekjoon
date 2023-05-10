package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        boolean[] numbs = new boolean[2000001];

        for (int i = 0; i < N; i++) {
            numbs[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for (int i = 0; i < 2000001; i++) {
            if(numbs[i]) sb.append(i - 1000000).append('\n');
        }
        System.out.println(sb);
    }
}
