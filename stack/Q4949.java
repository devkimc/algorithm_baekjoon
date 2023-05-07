package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while (true) {
            str = br.readLine();

            if (str.equals(".")) break;

            System.out.println(chkBalance(str) ? "yes" : "no");
        }
    }


    public static boolean chkBalance(String str) {
        ArrayList<Character> stack = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '(':
                    stack.add('(');
                    break;
                case ')':
                    if (stack.size() == 0 || stack.get(stack.size() - 1) != '(') {
                        return false;
                    }
                    stack.remove(stack.size() - 1);
                    break;
                case '[':
                    stack.add('[');
                    break;
                case ']':
                    if (stack.size() == 0 || stack.get(stack.size() - 1) != '[') {
                        return false;
                    }
                    stack.remove(stack.size() - 1);
                    break;
                default:
                    continue;
            }
        }
        return stack.size() == 0;
    }
}
