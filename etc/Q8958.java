package etc;

import java.util.Arrays;
import java.util.Scanner;

public class Q8958 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String[] result = Arrays.stream(in.nextLine().split("X")).filter(z->z!="").toArray(String[]::new);
            int answer = 0;
            for (int x = 0; x < result.length; x++) {
                answer += getSum(result[x]);
            }
            System.out.println(answer);
        }
    }

    public static int getSum(String str) {
        int answer = 0;
        for (int i = 1; i <= str.length(); i++) {
                      answer += i;
        }
        return answer;
    }
}
