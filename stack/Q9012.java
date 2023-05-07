package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), "");
            String PS = st.nextToken();
            System.out.println(chkVPS(PS) ? "YES" : "NO");
        }
    }

    public static boolean chkVPS(String PS) {
        int stack = 0;

        for (int i = 0; i < PS.length(); i++) {
            if (PS.charAt(i) == '(') {
                stack++;
            } else {
                if (stack == 0)  return false;
                stack--;
            }
        }
        return stack == 0;
    }
}
