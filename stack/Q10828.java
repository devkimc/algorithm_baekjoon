package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q10828 {
    public static ArrayList<Integer> stack = new ArrayList<Integer>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "top":
                    System.out.println(stack.size() == 0 ? -1 : stack.get(stack.size() - 1));
                    break;
                case "pop":
                    if (stack.size() == 0) {
                        System.out.println(-1);
                    } else {
                        int lastValue = stack.get(stack.size() - 1);
                        stack.remove(stack.size() - 1);
                        System.out.println(lastValue);
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.size() == 0 ? 1 : 0);
                    break;
                default:
                    int X = Integer.parseInt(st.nextToken());
                    stack.add(X);
                    break;
            }
        }
    }
}
