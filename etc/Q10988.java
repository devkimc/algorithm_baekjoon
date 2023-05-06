package etc;

import java.util.Scanner;

public class Q10988 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int answer = 1;
        for(int i = 0; i < word.length() / 2; i++) {
            if(word.charAt(0 + i) != word.charAt(word.length() - 1 - i)) answer = 0;
        }
        System.out.println(answer);
    }
}
