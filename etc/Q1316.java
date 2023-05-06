package etc;

import java.util.Scanner;

public class Q1316 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());
        int answer = 0;
        String str = "";

        for (int i = 0; i < count; i++) {
            str = in.nextLine();
            if(isConnected(str)) answer++;
        }

        System.out.println(answer);
    }

    public static boolean isConnected(String str) {
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i - 1)) continue;
            if(str.indexOf(str.charAt(i)) != i) {
                return false;
            }
        }
        return true;
    }
}
