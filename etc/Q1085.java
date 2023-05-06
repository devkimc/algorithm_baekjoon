package etc;

import java.util.Scanner;

public class Q1085 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
        int min = 1000;
        int[] distances = {x, y, Math.abs(w-x), Math.abs(y-h)};
        for(int i : distances) min = Math.min(min, i);
        System.out.println(min);
    }
}
