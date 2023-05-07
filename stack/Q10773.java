package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> stack = new ArrayList<Integer>();
        int K = Integer.parseInt(br.readLine());
        while (K-- > 0) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                stack.remove(stack.size() - 1);
            } else {
                stack.add(number);
            }
        }

        System.out.println(stack.stream().mapToInt(Integer::intValue).sum());
    }
}
