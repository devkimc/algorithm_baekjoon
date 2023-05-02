package etc;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q1152 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String[] words = word.split(" ");

        System.out.println(IntStream.range(0, words.length)
                .filter(i -> !words[i].equals(" ") && !words[i].equals(""))
                .mapToObj(i ->words[i])
                .toArray(String[]::new).length)
        ;
    }
}
