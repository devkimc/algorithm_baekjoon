import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next().toUpperCase();
        int max = 0;
        String maxWord = "?";
        String distinctWord = getDistinctWord(word);

        for(int i = 0; i < distinctWord.length(); i++) {
            int count = Math.toIntExact(countChar(word, distinctWord.charAt(i)));
            if(count == max) maxWord = "?";
            if(count > max) {
                max = count;
                maxWord = Character.toString(distinctWord.charAt(i));
            }
        }

        System.out.println(maxWord);
    }

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }

    public static String getDistinctWord(String str) {
        String answer = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }
}
